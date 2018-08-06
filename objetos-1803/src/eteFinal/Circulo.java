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
public abstract class Circulo extends Figura{

     private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public void Perimetro() {
        radio=getRadio();
        System.out.println("El Perimetro del circulo es: " + 3.1416 * 2 * radio);
    }

    @Override
    public void Area() {
        radio = getRadio();
       
        System.out.println("El Area del circulo es: " + 3.1416 * radio * radio);
    }
}
