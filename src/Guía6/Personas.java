package Guía6;

import Entidad.Persona;
import java.util.Scanner;

public class Personas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Persona p = new Persona();
        
        System.out.println("Ingresa la cantidad de personas que deseas agregar al sistema: ");
        int cantidad = (int) leer.nextInt();
        leer.nextLine();
        
        for (int i = 1; i <= cantidad; i++) {
                      
            System.out.println("=======================================");
            System.out.println("Ingresa los datos de la persona " + i);
            System.out.println("=======================================");
            
            System.out.print("Nombre: ");
            p.setNombre(leer.nextLine());

            System.out.print("Apellido: ");
            p.setApellido(leer.nextLine());

            System.out.print("Ciudad: ");
            p.setCiudad(leer.nextLine());

            System.out.print("Calle: ");
            p.setCalle(leer.nextLine());

            System.out.print("Altura: ");
            p.setAltura(leer.nextInt());

            System.out.print("DNI: ");
            p.setDni(leer.nextInt());

            System.out.print("Edad: ");
            p.setEdad(leer.nextInt());
            leer.nextLine();

            System.out.println("=============================");
            System.out.println("Los datos ingresados de la persona son: ");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("Ciudad: " + p.getCiudad());
            System.out.println("Calle: " + p.getCalle());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("DNI: " + p.getDni());
            System.out.println("Edad: " + p.getEdad());
        }
    }
}
