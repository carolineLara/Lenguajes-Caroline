
package PrimeraExcepcion;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SegundaExcepcion {
    
    public static void main(String[] args) {
        File f=new File("D:\\todos los archivos.txt");
        try {
            int x=2;
            int y=0;
            int div=x/y;
            FileInputStream fis=new FileInputStream(f);
                    int ch=0;
                    StringBuilder builder=new StringBuilder();
                    while((ch=fis.read())!=-1){
                        builder.append((char)ch);
                    }
                    System.out.println("se leyo bien y se encontro esto: "+builder.toString());
        } catch (FileNotFoundException ex) {
          
            System.out.println("checa el nombre");
        } catch (IOException ex){
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
             }
       }
   
}
// investigar bloque try catch y contrastar con el thows
//crear  jframe selecciona un archivo lector de archivos