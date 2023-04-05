/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */

package Circunferencia;

import static java.lang.StrictMath.pow;

public class Circunferencia {

    private float radio;
   
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void crearCincunferencia(float radio) {
        this.setRadio(radio);
    }

    public float calcularArea (float radio){
        return (float) ((Math.PI)*(pow(radio,2)));
    }
    
    public float crearPerimetro(float radio) {
        return (float) (radio * 2 * (Math.PI));
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}

