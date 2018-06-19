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
import java.io.*;
public class PersistenciaUsuario {
    //primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //paso 1 generar el archivo donde se va a guardar nuestro serializado
        File file=new File ("D:\\archivaldo.yomero");
        
             //Paso dos indicar que lo vamos a generar para escribit en el 
             FileOutputStream fos=new FileOutputStream(file);
             
             //Paso 3 escribir un objeto en el
             
             ObjectOutputStream oss=new ObjectOutputStream(fos);
             oss.writeObject(c);
             oss.close();
             
    }
}
