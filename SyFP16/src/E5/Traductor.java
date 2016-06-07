/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arturohdez
 */
public class Traductor 
{
    List<String>palabras;
    List<String>traducciones;        
    public String traducir (String t)
    {
        int i =palabras.indexOf(t);
        if( i==-1)
        {
            return t;
        }
        else
        {
            return traducciones.get(i);
        }
       
    }
    
    
    public void agregar (String a ,String b)
    {
        palabras.add(a);
        traducciones.add(b);
    }
    public String eliminar (String palabras)
    {
        return palabras;
    }
    public static void main (String[]args)
    {
        ArrayList<Traductor> arret;
        Traductor t = new Traductor();
        arret=new ArrayList<Traductor>();
    }
   public Traductor(){
    palabras = new ArrayList<>();
    traducciones = new ArrayList<>();
    
}

    public void agregar(String one) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 