/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;

/**
 *
 * @author arturohdez
 */
public class HoyNoC implements IHoyno 
{

    @Override
    
    public String HoyNoCircula() 
    {
        
        
           String jueves ="Hoy no circulan los vehículos con engomado color verde y terminación 1 y 2";
           return jueves;
    }

    @Override
    public String Placa(String t) 
    {
       if(t=="1"||t=="2")
        {
            return "jueves";
        }
       if(t=="3"||t=="4")
       {
           return "miercoles";
       }
       if(t=="5"||t=="6")
       {
           return "lunes";
       }
       if(t=="7"||t=="8")
       {
           return "martes";
       }
       if(t=="9"||t=="0")
       {
           return "viernes";
       }
        return null;
    }

    @Override
    public String TerminacionPlaca(String t) 
    {
        if(t=="jueves")
        {
            return "1,2";
        }
        if(t=="miercoles")
        {
            return "3,4";
        }
        if(t=="lunes")
        {
            return "5,6";
        }
        if(t=="martes")
        {
            return "7,8";
        }
        if (t=="viernes")
        {
            return "9,0";
        }
        return null;
        
    }

    @Override
    public String Color(String t) 
    {
        if(t=="verde")
        {
            return "jueves";
        }
        if(t=="azul")
        {
            return "viernes";
        }
        if(t=="amarillo")
        {
            return "lunes";
        }
        if(t=="rosa")
        {
            return "martes";
        }
        if(t=="rojo")
        {
            return "miercoles";
        }
        return null;
        
    }
    
}
