/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-101
 */
public class Conversion {
      private Grados grados;
    public float centigradosAFarenheit(){
        // Este metodo tiene lógica
        float resultado= grados.getCentigrados()*1.8f+32;
        return resultado;
    }

      public Grados getGrados(){
          return grados;
}

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
   
    private Longitudes longitudes;
    
     public float metrosAPies(){
        // Este metodo tiene lógica
        float resultado= longitudes.getMetros()*3.2808f;
        return resultado;
    }

      public Longitudes getLongitudes(){
          return longitudes;
}

    public void setLongitudes(Longitudes longitudes) {
        this.longitudes = longitudes;
}
}
