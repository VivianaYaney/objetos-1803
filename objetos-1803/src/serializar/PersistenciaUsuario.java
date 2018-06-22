/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario {
    //primero guardamos
   public static void guardar(Cliente c)throws Exception{
        //paso 1 generar el archivo donde se va a guardar nuestro serializado
        ArrayList<Cliente> clientes=new ArrayList<>();
        File file=new File ("archivaldo.yomero");
        if(file.exists())clientes= leer();
        clientes.add(c);
        
        
             //Paso dos indicar que lo vamos a generar para escribit en el 
             FileOutputStream fos=new FileOutputStream(file);
             
             //Paso 3 escribir un objeto en el
             
             ObjectOutputStream oss=new ObjectOutputStream(fos);
             oss.writeObject(clientes);
             oss.close();
             
    }
    
    public static ArrayList<Cliente> leer()throws Exception{
        //Para leer primero ponemos el archivo 
        File file= new File("archivaldo.yomero");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Cliente> clientes= (ArrayList<Cliente>) ois.readObject();
       return clientes;
    }
    

    
    
    
}

