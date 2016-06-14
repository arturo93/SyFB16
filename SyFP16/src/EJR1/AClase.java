/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJR1;

/**
 *
 * @author arturohdez
 */
public abstract class AClase implements  IClase{
    protected String descripcion;
    {
        this.descripcion = descripcion 
    }
    
    public void print()
    {
        System.out.println("descripcion");
    }
    
}

