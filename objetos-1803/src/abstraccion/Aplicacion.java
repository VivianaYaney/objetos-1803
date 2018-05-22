/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;


public class Aplicacion {
    public static void main(String[] args) {
        //crear un objeto de tipo Grados
        Grados g=new Grados();
        //A este objeto ñe asignamos un valor a su atributo centigrados
        g.setCentigrados(20);
        //Creamos un objeto de la clase conversion 
        Conversion c=new Conversion();
        c.setGrados(g);
        //aplicar el modelo
    
                System.out.println(c.centigradosAFarenheit());
                
         //crear un objeto de tipo Grados
        Longitudes l=new Longitudes();
        //A este objeto ñe asignamos un valor a su atributo centigrados
       l.setMetros(1);
        //Creamos un objeto de la clase conversion 
        Conversion c2=new Conversion();
        c2.setLongitudes(l);
        //aplicar el modelo
        
                System.out.println(c2.metrosAPies());
    }
    
  
}
