/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eteFinal;

/**
 *
 * @author T-101
 */
public abstract class Cuadrado  {
    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
   
}
