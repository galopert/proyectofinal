/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Trivia Matematica es donde se va a ir mostrando al usuario
 * preguntas matemáticas que debe ir resolviendo de forma acumulada
 * @author Galo
 * @version 1.0  
 */

//clase de la triviaMatematica 
public class TriviaMatematica {
  //atributos
    private char[] signo={'+','-','*'};
    private int[] numAleatorio;
    private int incorrecta1;
    private int incorrecta2;
    
    ManejaOperacionesTrivia operacion=new ManejaOperacionesTrivia();
  
    //método constructor
    public TriviaMatematica(){
        this.numAleatorio=new int[5];
        this.incorrecta1=0;
        this.incorrecta2=0;  
    }
    
    //método de operaciones matemáticas
    public void OperacionesMatematicas(){
        for (int i = 0; i < this.numAleatorio.length; i++) {
            this.numAleatorio[i]=((int) (Math.random()*(25-5+1)+5));
            for (int j = 0; j < 1; j++) {
                this.numAleatorio[j]=((int) (Math.random()*(25-5+1)+5));
                char sig=signo[(char) (Math.random()*3)];
            
            //swicth
            switch(sig){
                case '+'://en caso de que el signo sea + pasar por parámetro los random para realizar la suma
                    operacion.OperacionSuma(this.numAleatorio[i], this.numAleatorio[j]);
                    break;
                case '-'://en caso de que el signo sea - pasar por parámetros los random para realizar la resta
                    operacion.OperacionResta(this.numAleatorio[i], this.numAleatorio[j]);
                    break;
                case '*'://en caso de que el signo sea * pasar por parámetros los random para realziar la multiplicación
                    operacion.OperacionMultiplicacion(this.numAleatorio[i], this.numAleatorio[j]);
                    break;                
            }
             //asignar las incorrectas con sus respectivas reglas solicitadas
            this.incorrecta1=((int) (Math.random()*((this.operacion.getRespCorrecta()-1)+35-1)-35));
            this.incorrecta2=((int) (Math.random()*((this.operacion.getRespCorrecta()+1)-900+1)+900));
            
            //mostrar el problema a solucionar
            String operaciones="El resultado de la operacion "+this.numAleatorio[i]+sig+this.numAleatorio[j]+"\n";
            operaciones+=this.operacion.getRespCorrecta()+"\n";
            operaciones+=this.incorrecta1+"\n";
            operaciones+=this.incorrecta2+"\n";
            operaciones+="Digite una opción.";
            
            int opcion=0;
            //solicitar la respuesta al user
            opcion=Integer.parseInt(JOptionPane.showInputDialog(operaciones));
                if (this.operacion.Comprobar(opcion)) {
                    JOptionPane.showMessageDialog(null, "Respuesta correcta.");
                }else{
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, la respuesta correcta es "
                            +this.operacion.getRespCorrecta());
                }
                
            }
            
        }
        //mostrar finalmente cantidad de correctas y cantidad de incorrectas
        this.operacion.MostrarInfo();
      
    }//cierre operacion matemática
}//cierre class

