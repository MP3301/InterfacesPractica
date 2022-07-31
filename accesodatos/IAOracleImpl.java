/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

/**
 *
 * @author
 * x
 */
public class IAOracleImpl implements IAccesoDatos{

  @Override
    public void insertar() {
       
        
        System.out.println("insertar desde Oracle");
    }

    @Override
    public void listar() {
   
        
        System.out.println("listar desde Oracle");
    }

    @Override
    public void actualizar() {
        
        
        System.out.println("actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde Oracle");      
    }
    
    
    
}
