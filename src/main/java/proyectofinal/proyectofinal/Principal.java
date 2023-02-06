/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.proyectofinal;

/**
 * clase principal que muestra el menu de opciones 
 * @author Galo
 * @version 1.0  
 */
public class Principal {
      //método main
    public static void main(String args[]){
        //variable objeto
        MenuApps varMenu;
        //instanciar el objeto
        varMenu=new MenuApps();
        //utilizar método de objeto
        varMenu.MostrarMenuApps();
        //finalizar app
        System.exit(0);
        
    }//cierre main
    
}//cierre class



