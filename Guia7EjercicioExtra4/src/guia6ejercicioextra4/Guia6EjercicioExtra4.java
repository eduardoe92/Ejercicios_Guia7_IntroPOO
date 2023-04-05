/**
 Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */

package guia6ejercicioextra4;

import java.util.ArrayList;
import java.util.Scanner;


public class Guia6EjercicioExtra4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cocina cocina = new Cocina();

        // Agregar nuevas recetas
        boolean continuarAgregarRecetas = true;
        while (continuarAgregarRecetas) {
            System.out.print("Ingrese el nombre de la receta: ");
            String nombreReceta = sc.nextLine();

            Ingredientes ingredientesReceta = new Ingredientes();
            boolean continuarAgregarIngredientes = true;
            while (continuarAgregarIngredientes) {
                System.out.print("Ingrese el nombre del ingrediente: ");
                String nombreIngrediente = sc.nextLine();

                System.out.print("Ingrese la cantidad del ingrediente: ");
                int cantidadIngrediente = Integer.parseInt(sc.nextLine());

                ingredientesReceta.agregarIngrediente(nombreIngrediente, cantidadIngrediente);

                System.out.print("¿Desea agregar otro ingrediente? (s/n): ");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    continuarAgregarIngredientes = false;
                }
            }

            Receta receta = new Receta(nombreReceta, ingredientesReceta);
            cocina.agregarReceta(receta);

            System.out.print("¿Desea agregar otra receta? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuarAgregarRecetas = false;
            }
        }

        // Buscar receta por nombre
        System.out.print("Ingrese el nombre de la receta que desea buscar: ");
        String nombreReceta = sc.nextLine();
        Receta recetaEncontrada = cocina.buscarReceta(nombreReceta);
        if (recetaEncontrada != null) {
            System.out.println("La receta " + nombreReceta + " existe en la lista de recetas de la cocina.");
        } else {
            System.out.println("La receta " + nombreReceta + " no existe en la lista de recetas de la cocina.");
        }

        // Obtener lista de recetas disponibles con los ingredientes de la cocina
        Ingredientes ingredientesDisponibles = new Ingredientes();
        boolean continuarAgregarIngredientesDisponibles = true;
        while (continuarAgregarIngredientesDisponibles) {
            System.out.print("Ingrese el nombre del ingrediente disponible: ");
            String nombreIngrediente = sc.nextLine();

            System.out.print("Ingrese la cantidad del ingrediente disponible: ");
            int cantidadIngrediente = Integer.parseInt(sc.nextLine());

            ingredientesDisponibles.agregarIngrediente(nombreIngrediente, cantidadIngrediente);

            System.out.print("¿Desea agregar otro ingrediente disponible? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuarAgregarIngredientesDisponibles = false;
            }
        }

        ArrayList<Receta> recetasDisponibles = cocina.recetasDisponibles(ingredientesDisponibles);
        System.out.println("Las siguientes recetas se pueden preparar con los ingredientes disponibles en la cocina:");
        for (Receta receta : recetasDisponibles) {
            System.out.println("- " + receta.getNombre());
        }
    }
}
