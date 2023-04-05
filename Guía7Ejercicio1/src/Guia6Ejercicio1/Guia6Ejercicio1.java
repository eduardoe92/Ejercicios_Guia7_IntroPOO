
/**
 Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */

package Guia6Ejercicio1;

import Caracterista.Libro;

import java.util.Scanner;

public class Guia6Ejercicio1 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el ISDN, luego el Título, Luego el Autor y luego la cantidad de páginas de su libro");
        Libro l1 = new Libro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
        Libro l2 = new Libro(12345, "El Libro", "Pedro", 123);
        System.out.println(l1);
        System.out.println(l2);
    
    
    }
    
    

}