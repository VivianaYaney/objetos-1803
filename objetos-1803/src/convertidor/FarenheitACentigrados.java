/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

/**
 *
 * @author Viviana
 */
public class FarenheitACentigrados extends TranformacionGrados {
      @Override
    public float transformar(float grados) {
     float resultado=(grados-32)/1.8f;
     return resultado;
    }

    @Override
    public String toString() {
        return "Farenheit A Centigrados";
    }

}
