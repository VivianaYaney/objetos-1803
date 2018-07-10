/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

/**
 *
 * @author T-101
 */
public class Principal {
    
    public static void main(String[] args) {
        //E1 estado de creado
        Threadsito t1=new Threadsito();
        t1.setName("Marco");
        Threadsito t2=new Threadsito();
        t2.setName("Miriam");
        Threadsito t3=new Threadsito();
        t3.setName("Antonio");
        Relojito reloj=new Relojito();
        
        //E2 estado de inizializado
        t1.start();
        t2.start();
        t3.start();
        reloj.start();
    }
}
