/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraExcepcion;

//aqui usaremos las excepciones de tipo checked,en las que tu te tienes que hacer cargo de ellas .
//vamos a usar un paquete que no se encuentra por defecto tiene que agregarlo
//con un import

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SegundaExcepcion {
    
    public static void main(String[] args) {
        File f=new File("D://todos los archivos");
        try {
            FileInputStream fis=new FileInputStream(f);
        } catch (FileNotFoundException ex) {
           
        }
        
    }
   
}
// investigar bloque try catch y contrastar con el thows