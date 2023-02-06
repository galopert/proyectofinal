/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;

import javax.swing.JOptionPane;

/**
 * Cantidad de letras captura las palabras digitadas por el usuario y por medio de
 * varios ciclos for las Ordenada de menor a mayor según cantidad 
 * de letras que tiene la palabra
 * @author Galo
 * @version 1.0  
 */
public class CantidadLetras {

 //atributos
    private String letrasPalabra[];
    private int countChars;
    private String aux;
    private String vector[];
    
    //constructor
    public CantidadLetras(){
        this.letrasPalabra=new String[3];
        this.vector = new String [3];
        this.countChars=0;
    }
    
    // método para ingresar  un palabra y almacenarlo 
    //@param letrasPalabras guarda el texto y lo compara de menor a mayor
   // con un ciclo for 
    public void IngresarPalabra(){
        for(int i=0; i <this.letrasPalabra.length; i++){
            this.letrasPalabra[i]=JOptionPane.showInputDialog("Ingrese una palabra en la lista "+i);
        }
        //for para ordenar de menor a mayor
        for (int i=0; i < this.letrasPalabra.length; i++ ) {
            for (int j=i+1; j<this.letrasPalabra.length; j++) {
              if (this.letrasPalabra[i].length() > this.letrasPalabra[j].length()) {
                 String temp = this.letrasPalabra[i];
                 this.letrasPalabra[i] = this.letrasPalabra[j];
                 this.letrasPalabra[j] = temp;
                }
            }
        }
        //mostrar ordenas de menor a mayor
        String contenido="Ordenadas de menor a mayor según cantidad de letras\n";
        //para recorrer un vector debe de utilizar un loop tipo for
        for(int i=0; i<this.letrasPalabra.length; i++){
            contenido+=" " +i +" - " +
                    this.letrasPalabra[i]+ "("+this.letrasPalabra[i].length()+")"+  "\n";
        }
         JOptionPane.showMessageDialog(null, contenido);
    }//cierre ingresar palabra
    
    //método para ordenar en orden alfabetico las palabras
    public void OrdenAlfabetico(){
      
    //ordenar...
    for (int i=0; i<this.letrasPalabra.length; i++) {
        for (int j=0; j<this.letrasPalabra.length && i != j; j++) {
             if (this.letrasPalabra[i].compareToIgnoreCase(this.letrasPalabra[j]) < 0) {
              aux=this.letrasPalabra[i];
              this.letrasPalabra[i]= this.letrasPalabra[j];
              this.letrasPalabra[j]= aux;
            }
        }
    }
    //mostrar ordenadas alfabeticamente
    String contenido="Ordenadas alfabeticamente\n";
        //para recorrer un vector debe de utilizar un loop tipo for
        for(int i=0; i<this.letrasPalabra.length; i++){
            contenido+=" " +i +" - " +
                    this.letrasPalabra[i]+ "\n";
        }
         JOptionPane.showMessageDialog(null, contenido);
    }
} //cierre class
