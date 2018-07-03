/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class PrimerasExcepciones {
    public static void main(String[] args) {
        
        float a=2;
        int b=0;
      //System.out.println(a/b);//Es una excepcion aritmeticaException, el dividir entre 0 es invalido
      int arreglo[]={3,4,2};
        System.out.println("Hola mundo");
       // System.out.println(arreglo[3]);   //El indice el arreglo esta fuera de limite
       String numeroMalo="cuatro";
       int numeroBueno=Integer.parseInt(numeroMalo);
        System.out.println(numeroBueno*2);
        System.out.println("no me veras!!");
    }
}
