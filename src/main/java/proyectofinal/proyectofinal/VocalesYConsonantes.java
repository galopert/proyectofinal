/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;

import javax.swing.JOptionPane;

/**
 * Vocales y consonantes es un metodo para ordenar de menor a mayor de
 * acuerdo a la cantidad de Vocales o consonantes igualmente pata ordenarlas alfabeticamente
 * @author Galo
 * @version 1.0  
 * 
 */


//argumentos de consola del metodo main
public class VocalesYConsonantes {

    //atributos
    private String palabra[];
    private int vcount[];
    private int ccount[];
    
    //constructor por omisión
    public VocalesYConsonantes(){
        this.palabra=new String[3];
        this.vcount= new int[3];
        this.ccount= new int[3]; 
    }//cierre vocales y consonantes
   
    //Metodo que solicita las palabras y las almacena en el array palabra 
    public void SolicitarPalabra(){
        for(int i=0; i<this.palabra.length; i++){
            this.palabra[i]=JOptionPane.showInputDialog("Ingrese una palabra en la lista "+i);
             this.palabra[i] = this.palabra[i].toLowerCase();
        }
        //verificar vocales y consonantes 
        for (int i = 0; i < palabra.length; i++) {
            for (int j = 0; j < palabra[i].length(); j++) {
                if (palabra[i].charAt(j) == 'a' || palabra[i].charAt(j) == 'e' || palabra[i].charAt(j) == 'i' 
                        || palabra[i].charAt(j) == 'o' || palabra[i].charAt(j) == 'u') {
                    vcount[i]++;
                }else if (((palabra[i].charAt(j)>= 'a' && this.palabra[i].charAt(j)<='z'))) {
                    ccount[i]++;
                }   
            }
        }
    }//cierre solicitar palabra
    
    // Metodo que ordena de menor a mayor según cantidad vocales y las almacena en el array vcount  
    public void MostrarPorVocales(){
        for (int i = 0; i < this.palabra.length; i++) {
            for (int j = i+1; j < this.palabra.length; j++) {
                if (this.vcount[i] > this.vcount[j]) {
                    String temp=this.palabra[i];
                    this.palabra[i]=this.palabra[j];
                    this.palabra[j]=temp;
                    int aux=this.vcount[i];
                    this.vcount[i]=this.vcount[j];
                    this.vcount[j]=aux;
                }
            }      
        }
        
        //Imprime las palabras ordenadas de menor a mayor por vocales
        String contenido="Orden de menor a mayor según cantidad de vocales\n";
            for (int i = 0; i < this.palabra.length; i++) {
                contenido+=this.palabra[i]+"("+this.vcount[i]+")" +"\n";
            }
            JOptionPane.showMessageDialog(null, contenido);
    }//cierre mostrar por vocales
    
    //Metodo para mostrar las palabras ordenadas de menor a mayor según cantidad de consonantes 
    //y almacenarlas en el array ccount
    public void MostrarPorConsonantes(){
        for (int i = 0; i < this.palabra.length; i++) {
            for (int j = i+1; j < this.palabra.length; j++) {
                if (this.ccount[i] > this.ccount[j]) {
                    String temp=this.palabra[i];
                    this.palabra[i]=this.palabra[j];
                    this.palabra[j]=temp;
                    int aux=this.ccount[i];
                    this.ccount[i]=this.ccount[j];
                    this.ccount[j]=aux;
                }
            }      
        }
        //Imorime las palabras ordenadas de menor a mayor por cantidad de consonantes
        String contenido="Orden de menor a mayor según cantidad de consonantes\n";
            for (int i = 0; i < this.palabra.length; i++) {
                contenido+=this.palabra[i]+"("+this.ccount[i]+")" +"\n";
            }
            JOptionPane.showMessageDialog(null, contenido);
    }//cierre mostrar por consonantes
    
    //Método para ordenar alfabeticamente 
    public void OrdenarAlfabeticamente(){
        for (int i=0; i<this.palabra.length; i++) {
        
             for (int j=0; j<this.palabra.length && i != j; j++) {
            
                 if (this.palabra[i].compareToIgnoreCase(this.palabra[j]) < 0) {
                 String aux=this.palabra[i];
                 this.palabra[i]= this.palabra[j];
                 this.palabra[j]= aux;
            }
        }
    }//cierre método
        
   //mostrar ordenadas alfabeticamente     
   String contenido="Ordenadas alfabeticamente\n";
        //para recorrer un vector debe de utilizar un loop tipo for
        for(int i=0; i<this.palabra.length; i++){
            contenido+=" " +i +" - " +
                    this.palabra[i]+ "\n";
        }
         JOptionPane.showMessageDialog(null, contenido);
    }
              
}//cierre class

