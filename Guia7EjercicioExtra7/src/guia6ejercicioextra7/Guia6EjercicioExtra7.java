
/**
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 e imprime el área del rectángulo.
 */

package guia6ejercicioextra7;

import java.util.Scanner;

public class Guia6EjercicioExtra7 {

    public static void main(String[] args) {
        
        Rectangulo crear = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un valor para el Lado 1: ");
        crear.setLado1(leer.nextInt());
        System.out.print("Ingrese un valor para el Lado 2: ");
        crear.setLado2(leer.nextInt());
        
        System.out.println("El área del rectangulo es: " + crear.calcular_Area());
        
        crear.dibujarRectangulo();
    }
}
