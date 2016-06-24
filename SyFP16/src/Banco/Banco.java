/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arturohdez
 */
public class Banco 
{
    List<Cuenta>listcue;
    List<Cliente>listcli;
    
    public Banco()
    {
        listcue = new ArrayList();
        listcli = new ArrayList();
    }
    public void agregarCliente (Cliente a)
    {
        listcli.add(a);//a sat lista agrego el cliente 
    }
    public void agregarCuenta (Cuenta b)
    {
        listcue.add(b);
    }
    public void guardarClientes()
    {
        try(BufferedWriter br = new BufferedWriter(new FileWriter("clientes.txt")))
        {
           for (Cliente cl : listcli)
           {
               br.write(cl.getId()+""+cl.getNombre()+""+cl.getCuenta()+""+cl.getEdad()+"\n");
           } 
        }
            
               
      catch (FileNotFoundException ex) 
            {
            
            }   catch (IOException ex)  {
            
                                        }
    }
    public void guardarCuenta()
    {
        try(BufferedWriter br = new BufferedWriter(new FileWriter("cuenta.txt")))
        {
            for (Cuenta ct : listcue)
           {
               br.write(ct.getSaldo()+""+ct.getNcuenta()+""+ct.getNcliente()+"\n");
           } 
        } 
        catch (IOException ex)
                {
            
                }
    
    }
    public static void main(String[] args) 
    {
        Banco b = new Banco();
        Cliente c = new Cliente("Arturo","22",77529,123);
        Cliente d = new Cliente("Jos","21",1234,1233);
        Cliente e = new Cliente("Oscar","23",12334,123333);
        Cliente f = new Cliente("H","20",12234,12533);
        Cliente g = new Cliente("Lee","19",1212234,1299933);
        b.agregarCliente(g);
        b.agregarCliente(c);
        b.agregarCliente(d);
        b.agregarCliente(e);
        b.agregarCliente(f);
        
        b.guardarClientes();
        
        
        
    }
}
