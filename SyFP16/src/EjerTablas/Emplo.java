/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerTablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arturohdez
 */
public class Emplo extends AbstractTableModel {
    String m [][];
    String guardar;
    int i = 0;
    String cols[];
    String linea ;
    

    public int numrenglon ()
    {
       try {
           BufferedReader br = null ;
           String linea;
            br = new BufferedReader(new FileReader (guardar));
            linea = br.readLine();
            while(linea !=null)
            {
                i=i+1;
                linea= br.readLine();
                
            }
            
       }
                    
      catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(Emplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
            
    public int numcontar()
    {        
        try {BufferedReader br = null ;
            br = new BufferedReader(new FileReader (guardar));
            linea= br.readLine();
            cols = linea.split(",");
            i=cols.length;
            
            
            
                    
                    } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(Emplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return i;
    }
    
    
    public Emplo() 
    {
        
    }
    

    @Override
    public int getRowCount() 
    {
        return numrenglon();
    }

    @Override
    public int getColumnCount() 
    {
        return numcontar();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return m [rowIndex][columnIndex];  
    }

    public Emplo(String s) throws IOException
    {   m=new String [numrenglon()][numcontar()];
        BufferedReader br = null;
        String row [];
        
        
        try 
        {
            String linea;
            br = new BufferedReader(new FileReader(s));  //instancia para leer un archivo
            linea = br.readLine();
            while(linea !=null)
            {
                System.out.println(linea);
                linea = br.readLine();
                row= linea.split(",");
                m[0]=row;
                
                i=i+1;
                linea = br.readLine();
            }
             
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo No Encontrado");
        } catch (IOException ex)
        {
            System.out.println("No Puedo leer el archivo");
        }finally
        {
          
        }
        
        
        
        
    }
}   
