
/**
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

package guia6ejercicio2;

import Circunferencia.Circunferencia;
import java.util.Scanner;

public class Guia6Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el area");
        float radio = (float) leer.nextInt();
        
        Circunferencia circulo1= new Circunferencia();
        
        circulo1.crearCincunferencia(radio);
        
        System.out.println("Perimetro= " +circulo1.crearPerimetro(radio));
        
        System.out.println("Area= " +circulo1.calcularArea(radio));
        
        System.out.println(circulo1);
       
    }
}