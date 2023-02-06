/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;
import javax.swing.JOptionPane;

/**
 * Clasificacion de palabras opera un submenu para el usuario escojer como desea ver las
 * palabras digitas el cual lo realiza con un llamado de metodos.
 * @author Galo
 * @version 1.0  
 */
public class ClasificacionPalabras {
    //atributos
    private VocalesYConsonantes varVocalesYConsonantes;
    private CantidadLetras varCantidadLetras;
    

     
    //método para mostrar el menu de opciones para elejir como ver las palabras
    
     public void MenuClasificarPalabras(){
        String opcionesApps="***Aplicación de clasificar palabras***\n";
        opcionesApps +="1.Ordenar de menor a mayor por cantidad de letras\n";
        opcionesApps +="2.Ordenar de menor a mayor por cantidad de vocales\n";
        opcionesApps +="3.Ordenar de menor a mayor por cantidad de consonantes\n";
        opcionesApps +="Digite una opción";
        
        int opcion=0;
        //instanciar clases
        this.varVocalesYConsonantes=new VocalesYConsonantes();
        this.varCantidadLetras=new CantidadLetras();
        
        //solicitar a usuario que digite la opción 
        opcion=Integer.parseInt(JOptionPane.showInputDialog(opcionesApps));
        //swithc de opciones
        
        switch(opcion){
            case 1:// en caso de que sea 1 mostrar por cantidad de letras
               this.OrdenCantidadLetras();
                break;
            case 2://en caso de que sea 2 mostrar por cantidad de vocales
                this.OrdenCantidadVocales();
                break;
            case 3://en caso de que sea 3 mostrar por cantidad de consonantes
                this.OrdenCantidadConsonantes();
                break;
        }  
     }//cierre menu
     //método para instanciar clase y métodos para ordenar por cantidad de letras
     public void OrdenCantidadLetras(){
         this.varCantidadLetras=new CantidadLetras();
         this.varCantidadLetras.IngresarPalabra();
         this.varCantidadLetras.OrdenAlfabetico();
     }
     
     //método para instanciar clase y métodos para ordenar por cantidad de vocales
     public void OrdenCantidadVocales(){
         this.varVocalesYConsonantes=new VocalesYConsonantes();
         this.varVocalesYConsonantes.SolicitarPalabra();
         this.varVocalesYConsonantes.MostrarPorVocales();
         this.varVocalesYConsonantes.OrdenarAlfabeticamente();
     }
     
     //método para instanciar clase y métodos para ordenar por cantidad de consonantes
     public void OrdenCantidadConsonantes(){
         this.varVocalesYConsonantes=new VocalesYConsonantes();
         this.varVocalesYConsonantes.SolicitarPalabra();
         this.varVocalesYConsonantes.MostrarPorConsonantes();
         this.varVocalesYConsonantes.OrdenarAlfabeticamente();
     }
    
}//cierre class
