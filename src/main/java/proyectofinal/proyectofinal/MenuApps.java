/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;

/**
 * Menu apps es donde el usuario selecciona cual opcion prefiere y 
 * se llaman a los metodos
 * @author Galo
 * @version 1.0  
 */
import javax.swing.JOptionPane;

    //Constructor pot omision
   

public class MenuApps {  
    //
    private ClasificacionPalabras varClasificacionPalabras;
    private PalabrasDesordenadas varPalabrasDesordenadas;
    private TriviaMatematica varTriviaMatematica;
    
    //Mostra menú para elegir aplicación
    public void MostrarMenuApps(){
        String opcionesApps="***Elección de Aplicación***\n";
        opcionesApps +="1.Clasificación de palabras\n";
        opcionesApps +="2.Palabras desordenadas\n";
        opcionesApps +="3.Trivia matemática\n";
        opcionesApps +="4.Finalizar programa\n";
        opcionesApps +="Digite una opción";
        
        int opcion=0;
        //instanciar 
        this.varClasificacionPalabras=new ClasificacionPalabras();
        this.varPalabrasDesordenadas=new PalabrasDesordenadas();
        this.varTriviaMatematica=new TriviaMatematica();
        //do while en que se mostrara info y solicitar opción a usuario
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(opcionesApps));
            //swicth de opciones
            switch(opcion){
                case 1://en caso de que sea 1 enviar a la app 1
                    this.varClasificacionPalabras.MenuClasificarPalabras();
                    break;
                case 2://en caso de que sea 2 enviar a la app 2
                    this.varPalabrasDesordenadas.MostrarPalabraDesordenada();
                    break;
                case 3://en caso de que sea 3 enviar a la app 3
                    this.varTriviaMatematica.OperacionesMatematicas();
                    break;
                case 4://en caso de que sea 4 salir del programa
                    break;
            }  
        }while(opcion != 4);    
    }//cierre menu
    
}//cierre class

