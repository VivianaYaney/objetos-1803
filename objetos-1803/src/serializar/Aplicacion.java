/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author T-101
 */
public class Aplicacion {
    public static void main(String[] args) throws Exception {
        
       for(Cliente c:PersistenciaUsuario.leer()){
        
        System.out.println("Nombre "+c.getNombre()+" Edad "+c.getEdad());
        
    }
    
      /*Cliente c=PersistenciaUsuario.leer();
        //System.out.println("Vamos a checar el nombre "+c.getNombre());
        Cliente c=new Cliente();
        c.setNombre("Antonio");
        c.setEdad(31);
        PersistenciaUsuario.guardar(c);
*/
    }
    
}