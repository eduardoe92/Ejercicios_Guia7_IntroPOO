/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el
 * aumento salarial de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30
 * años o del 5% si tiene menos de 30 años.
 */
package guia6ejercicioextra6;

import Entidades.Empleado;
import java.util.Scanner;

public class Guia6EjercicioExtra6 {

     public static void main(String[] args) {

            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Ingrese la cantidad de empleados que desea verificar: ");
                    int cantidad = (int) leer.nextInt();
                    System.out.println("========================================================");
                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingrese el nombre del empleado " +i+ ": ");
                        String nombre = leer.next();
                        System.out.print("Ingrese la edad del empleado: ");
                        int edad = leer.nextInt();
                        System.out.print("Ingrese el salario del empleado: ");
                        float salario = leer.nextFloat();
                        System.out.println("========================================================");
                        Empleado empleado = new Empleado(nombre, edad, salario);
                        empleado.calcular_aumento();

                        System.out.println(empleado.toString());
                        System.out.println("========================================================");
         }
       }
    }
