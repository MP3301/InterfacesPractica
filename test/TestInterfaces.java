/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import accesodatos.*;

/**
 *
 * @author
 * x
 */
public class TestInterfaces {
    
    public static void main(String[] args) {
        
        //uso de interfaces y sus clases impl
        
        IAccesoDatos datos = new IAccesoDatosImpl();
      
        imprimir(datos);
        
        IAccesoDatos datos2 = new IAOracleImpl();
     
         imprimir(datos2);
    }
    
    public static void imprimir(IAccesoDatos datos){
     datos.listar();
    }
    
}
