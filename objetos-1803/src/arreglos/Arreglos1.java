/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-101
 */
public class Arreglos1 {
 
    public static void main(String[] args) {
        int[]Valores={1,-20,4};
        
        for(int i=0;i<Valores.length;i++){
           System.out.println(Valores[i]);
     
       }
        
        //este ciclo for es el mejorado y se recomienda siempre
        for(int v:Valores){
            System.out.println(v);
        }
        
        //segunda forma de inicializar los arreglos
        
        int otro[]=new int[4];
        
        for(int valor:otro){
            System.out.println(valor);
        }
    }
    
}
