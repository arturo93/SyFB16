/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import E9.MyException;
import E9.TestMyException;

/**
 *
 * @author
 */
public class Cuenta {
    
    double saldo = 100.00;
    int ncuenta;

    public double getSaldo() {
        return saldo;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public int getNcliente() {
        return ncliente;
    }
    int ncliente;
    
    
    double checkSaldo(){
        
        return saldo;
    }
    
    void deposito(double depos) throws WrongAmountException{
         if(depos <= 0.0)
        {
            throw new WrongAmountException("No Se Puede depositar es cantidad");
        }
         else{
             
             saldo = saldo + depos;
             System.out.println( "saldo depues del deposito  "+ saldo);
        }
    }
    
    void retiro(double saldoaret) throws SaldoInsuficienteException{
        if(saldoaret >=saldo)
        {
            throw new SaldoInsuficienteException("no se puede retirar mas de lo que tienes no seas wey!!");
     
           
        }
        
        else 
        {
           saldo = saldo - saldoaret;
            System.out.println("el saldo disponible despues del retiro es " + saldo);
        }
        
            
        
        
        
    }
        
    public static void main(String[] args) {
       Cuenta cue = new Cuenta();
       double saldo = cue.checkSaldo();
        try {
            System.out.println("Saldo al inicio " + saldo);
            cue.deposito(20.00);
            
            
        } catch ( WrongAmountException ex) {
            System.out.println(ex.toString());
        }
        try{
            cue.retiro(10.00);
            
        }catch(SaldoInsuficienteException ins){
            System.out.println(ins.toString());
        }
        
    }
    
}
