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
public class PiesAMetros extends TranformacionGrados{
     @Override
    public float transformar(float grados) {
        float resultado=grados/3.2808f;
        return resultado;
    } 
    @Override
   public String toString() {
        return "Pies A Metros";
    }

}
