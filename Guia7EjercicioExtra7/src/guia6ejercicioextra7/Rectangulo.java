/**
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
 * método "calcular_area" que calcule y devuelva el área del rectángulo.
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
 * de 4 y 6 e imprime el área del rectángulo.
 */
package guia6ejercicioextra7;

import java.util.Scanner;

public class Rectangulo {

    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public float calcular_Area() {
        return lado2 * lado1;
    }

    public void dibujarRectangulo() {
        for (int i = 1; i <= lado2; i++) {
            for (int j = 1; j <= lado1; j++) {
                if (i > 1 && i < lado2 && j > 1 && j < lado1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
