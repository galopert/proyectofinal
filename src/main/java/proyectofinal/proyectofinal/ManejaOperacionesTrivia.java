/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;

import javax.swing.JOptionPane;

/**
 * Maneja Operaciones realiza las operaciones matematicas escogidas por el usuario 
 * @author Galo
 * @version 1.0  
 */
public class ManejaOperacionesTrivia {
 //atributos
    private int respCorrecta;
    private int corr;
    private int inc;
    
    //constructor 
    
    public ManejaOperacionesTrivia(){
        this.respCorrecta=0; 
        this.corr=0;
        this.inc=0;
    }
    //operación de suma
    /**
     * 
     * this.respCorrecta = @param num1 + param num2
     * @param num1
     * @param num2 
     */
    public void OperacionSuma(int num1, int num2){
        this.respCorrecta=num1+num2;    
    }
 
    //operación de resta
    /**
     * this.respCorrecta = param num1 - param num2
     * @param num1
     * @param num2 
     */
    public void OperacionResta(int num1, int num2){
        this.respCorrecta=num1-num2;
    }
    
    //operación de multiplicación
    /**
     * this.respCorrecta = @param num1 * param num2
     * @param num1
     * @param num2 
     */
    public void OperacionMultiplicacion(int num1,int num2){
        this.respCorrecta=num1*num2;
    }
    
    //set y get
    /**
     * 
     * @return respCorrecta
     */
    public int getRespCorrecta() {
        return respCorrecta;
    }
    /**
     * @param respCorrecta 
     */
    public void setRespCorrecta(int respCorrecta) {
        this.respCorrecta = respCorrecta;
    }
    
    //comprobara respuesta correcta
    /**
     * 
     * @param eleccion
     * @return 
     */
    public boolean Comprobar(int eleccion){
        boolean comprobar=false;
        // if que compruebe si la respuesta correcta es igual a lo digitado por el user, mediante parámetro
        if (this.getRespCorrecta()==eleccion) {
            //aumentar correctas
            this.corr++;{
            comprobar=true;
        }
        }else{//si no aumentar incorrectas
            this.inc++;
            comprobar=false;
        }
        return comprobar;
    }//cierre comprobar
    
    //método para mostrar las correctas e incorrectas
    
    public void MostrarInfo(){
        JOptionPane.showMessageDialog(null, "Cantidad de correctas es de: "+this.corr +"\n"+
                "La cantidad de incorrectas es de: "+this.inc);
    }//cierre mostrar info
    
}//cierre class

