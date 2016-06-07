/*
 ¿que es una excecion en java?
Es un error en tiempo de ejecucion
las excepciones en java son de 2 tipos
unchecked exception no tienes que hacerte cargo de ellas el compilador te ayuda
checked exception tu te haces cargo de ellas con codigo
 */
package PrimeraExcepcion;

/**
 *
 * @author T-107
 */
public class primera {
    
    public static void main(String[] args) {
        //veremos primero las mas comunes de las unchecked
        float x=4;
        int y=0;
        System.out.println(x/y);
        
        
        
        String falsoNumero="5"; // dar un valor para que ya no  marque la excepcion
        int numeroReal=5;
         System.out.println("Este es antes de la excepcion");
        int suma=Integer.parseInt (falsoNumero)+numeroReal;
        System.out.println("todo esta bien hasta aqui");
        
        if(true){
            System.out.println("siempre aparecere");
        
    }
        System.out.println("la ejecucion siempre pasa aqui se ejecute o no el if");
}
}