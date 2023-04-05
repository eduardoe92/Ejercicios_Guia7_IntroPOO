
/**
 Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */

package guia6ejercicioextra4;

public class Receta {
    private String nombre;
    private Ingredientes ingredientes;

    public Receta(String nombre, Ingredientes ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean puedoPreparar(Ingredientes ingredientesDisponibles) {
        return ingredientesDisponibles.tengoTodosLosIngredientes(ingredientes);
    }
}
