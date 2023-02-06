/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;

import javax.swing.JOptionPane;

/**
 * Palabras desordenadas tiene almacenadas 8 palabras las cuales
 * se desordenan mediante varios ciclos for
 * para que el usuario logre resolver 
 * @author Galo
 * @version 1.0  
 */

//clase de palabras Desordenadas
public class PalabrasDesordenadas {
    
    //atributos
    private String[] palabras={"hola","casa","sol","perro","cadena","flecha","agua","marzo"};//palabras para desordenar
    private char[] letras;
    private int correctas;//arreglo para almacenar las palabras correctas
    private int fallidas;// arreglo para almacenar las palabras incorrectas

    
    //constructor
    public PalabrasDesordenadas(){
    this.correctas=0;
    this.fallidas=0;
    }
    
    //Método para mostrar palabras desordenadas
    
    public void MostrarPalabraDesordenada(){
        for(int i=0; i<5; i++){
            int n= (int) (Math.random()*8);
            String palabraRandom= this.palabras[n];
            this.letras = palabraRandom.toCharArray();
            //for para desordenar las letras de la palabra 
            for (int j = 0; j < this.letras.length; j++) {
                int posicion= (int) (Math.random()*this.letras.length);
                char letra = this.letras[j];
                this.letras[j] = this.letras[posicion];
                this.letras[posicion] = letra;
            }
            String palabraDesordenada = new String(letras);
            // mostrar la palabra y que la digite ordenada
            String desordenada = "La palabra desordenada: "+ palabraDesordenada+ "\n";
            desordenada +="Digite la palabra correcta";
            String eleccion=JOptionPane.showInputDialog(desordenada);
            palabraRandom = palabraRandom.toLowerCase();
            //if que comprueba si dicha palabra es igual a la digitada al usuario
            if (palabraRandom.equals(eleccion)) {//de ser asi aumentar 1 al contador correctas
               this.correctas++;
               JOptionPane.showMessageDialog(null, "Palabra correcta");
            }else{//si no aumentar 1 al contador incorrectas
                this.fallidas++;
                JOptionPane.showMessageDialog(null, "Palabra incorrecta");
            }
        }
        //mostrar cantidad de correctas e incorrectas
        JOptionPane.showMessageDialog(null, "La cantidad de palabras acertadas es de: "+this.correctas);
        JOptionPane.showMessageDialog(null, "La cantidad de palabras fallidas es de: "+this.fallidas);
    }
}//cierre class
