/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiposdatos;

/**
 *
 * @author T-107
 */
public class Tipos1 {
    public static void main(String[]args){
        //declaramos un byte
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        b=(byte)s;
        s=b;
        l=i;
        i=s;
        l=b;
        s=(short)l; //casting forzado
        i=b;
        Operaciones o=new Operaciones();
        System.out.println(o.suma(4,5));
        
}
}
