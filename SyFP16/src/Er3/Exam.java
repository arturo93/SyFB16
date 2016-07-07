/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Er3;

import EjerTablas.Emplo;
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
public class Exam extends AbstractTableModel
{
String a [][];
String contar;
int i = 0;
String col[];
String Frame ;
String Glue ;
String Puzzle;
String Storage;
String row [];

public int Frame () 
{
  try{
           BufferedReader br = null ;
           i=0;
           String Frame;
            br = new BufferedReader(new FileReader (contar));
            Frame = br.readLine();
            while(Frame !=null)
     {
           col=Frame.split(",");
          if(row[4].equals("FRAME"))
          {
           i=i+1;   
          }
           Frame= br.readLine();
          
             
     }
           
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    }
       return i; 
}
       
 public int Glue () 
    {
       try {
           BufferedReader br = null ;
           i=0;
           String Glue;
            br = new BufferedReader(new FileReader (contar));
           Glue = br.readLine();
            while(Glue !=null)
     {
           col=Glue.split(",");
          if(row[4].equals("GLUE")){
           i=i+1;
          
          }
           Glue= br.readLine();
          
          
     }
           
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    }
       return i; 
    }       
public int Puzzle () 
{
  try{
           BufferedReader br = null ;
           i=0;
           String Puzzle;
            br = new BufferedReader(new FileReader (contar));
            Puzzle = br.readLine();
            while(Puzzle !=null)
     {
           col=Puzzle.split(",");
          if(row[4].equals("PUZZLE"))
          {
           i=i+1;   
          }
           Puzzle= br.readLine();
          
               return i; 
     }
           
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    }
}  
  public int Storage () 
{
  try{
           BufferedReader br = null ;
           i=0;
           String Storage;
            br = new BufferedReader(new FileReader (contar));
            Frame = br.readLine();
            while(Storage !=null)
     {
           col=Storage.split(",");
          if(row[4].equals("STORAGE"))
          {
           i=i+1;   
          }
           Frame= br.readLine();
          
           
     }
           
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Puzzle.class.getName()).log(Level.SEVERE, null, ex);
    }
  return i; 
}
       
            
                   

    @Override
    
    public int getRowCount() 
    {
    return 4;
    }

    @Override
    public int getColumnCount()
    {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return 4;
    }
    
}
