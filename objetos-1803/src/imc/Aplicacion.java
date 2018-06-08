/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author Viviana
 */
public class Aplicacion {
    public static void main(String[] args) {
        Usuario u=new Usuario();
        //A este objeto ñe asignamos un valor a su atributo centigrados
        u.setAltura((float) 1.75);
        u.setPeso(55);
        //Creamos un objeto de la clase conversion 
        Imc i=new Imc();
        i.setUsuario(u);
        //aplicar el modelo
    
                System.out.println(i.masa());
        
    }
}
