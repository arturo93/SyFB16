/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arturohdez
 */
public class Convertidor
{ 
    Map<String,Double> lista = new HashMap();//una variable con su instancia
    {lista.put("centimetros",0.01);
     lista.put("metros", 1.00);
     lista.put("kilometros",1000.00);
     lista.put("pulgadas",0.0254);
     lista.put("pies", 0.305);
     lista.put("yardas", 0.919);
     lista.put("millas",1613.00);
    
    }
     public double convertir(String a,double b,String c)
     {
         if (lista.containsKey(a))
         {
             double cm = lista.get(a);
             cm = cm*b;
             double inch = lista.get(c);
             return cm/inch;
             
             
         }
         return 0.0 ;
     }
     
     public static void main(String[] args) 
     {
       Convertidor conver = new Convertidor ();
       double g = conver.convertir("centimetros", 30, "pies");
       System.out.println(g);
       
     }
     
  
    
}
