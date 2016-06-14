/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER2;

/**
 *
 * @author arturohdez
 */
public interface IArchivo 
{
    public int abrirArchivo(String nombreArchivo, String tipoArchivo);
    public int cerrarArchivo();
    public void despleglarArchivos();
}
