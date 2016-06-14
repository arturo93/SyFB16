/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arturohdez
 */
public class Quick implements IOrdenamiento
{

    @Override
    public int[] ordenar(int[] array) 
    {
        int array1[];//variable de array
        System.out.println("estan en la clase Quick y en el metodo ordenar");
        List <Integer>a = new ArrayList<Integer>();
        Integer b = new Integer(1);
        Integer c = new Integer(2);
        Integer d = new Integer(3);
        Integer e = new Integer(4);
        Integer f = new Integer(5);
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        a.add(f);
        return array;
    
    }

    @Override
    public List<Integer> ordenar(List<Integer> array)
    {
        return null;
        
    }
    
}
    
    

