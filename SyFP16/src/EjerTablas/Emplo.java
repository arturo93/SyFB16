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
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arturohdez
 */
public class Emplo extends AbstractTableModel {
    String m [][];

    public Emplo() {
    }
    

    @Override
    public int getRowCount() 
    {
        return 100;
    }

    @Override
    public int getColumnCount() 
    {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return m [rowIndex][columnIndex];  
    }

    public Emplo(String s) throws IOException
    {   m=new String [100][6];
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
                int i = 0;
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
