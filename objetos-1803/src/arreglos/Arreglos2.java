/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Viviana
 */
public class Arreglos2 {
    public static void main(String[] args) {
       int[]Valores={1,34,-34,12};
       String[]Hola={"Hola","Mundo"};
       
        for(int v:Valores){
            System.out.println(v);
        }
        for(String h:Hola){
            System.out.println(h);
        }
         int otro[]=new int[3];
        
        for(int valor:otro){
           System.out.println(valor);
        }
    }
         
}
