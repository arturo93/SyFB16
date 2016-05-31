/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author arturohdez
 */
public class Cesar 
{
  public String cifrar (String m, int constante)
  {
    String resultado =" ";
    for(int i= 0;i<m.length();i++)
    {
       resultado=resultado+(char)(m.charAt(i)+constante);
    }
    return resultado;
       
       
    }
            public static void main(String[] args) 
    {
        Cesar c = new Cesar ();
        
        String s =c.cifrar("hola",3);
        
        System.out.println(s);
        
        Cesar a = new Cesar();
     
     String b = a.descifrar(s,3);
     
     System.out.println(b);

        
    }
     public String descifrar (String n,int constante) 
     {
         String resultado =" ";
         for(int i= 0;i<n.length();i++)
    {
       resultado=resultado+(char)(n.charAt(i)-constante);
    }
    return resultado;
     }
     
}
