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
public class CentigradosAFarenheit extends TranformacionGrados{
     @Override
    public float transformar(float grados) {
     float resultado=(grados*1.8f)+32;
     return resultado;
    }

    @Override
    public String toString() {
        return "Centigrados A Farenheit";
    }

}

