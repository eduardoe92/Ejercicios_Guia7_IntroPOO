
/**
 Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */

package guia6ejercicioextra4;

import java.util.HashMap;

public class Ingredientes {
    
    private HashMap<String, Integer> ingredientes;

    public Ingredientes() {
        this.ingredientes = new HashMap<>();
    }

    public void agregarIngrediente(String nombreIngrediente, int cantidad) {
        ingredientes.put(nombreIngrediente, cantidad);
    }

    public boolean tengoTodosLosIngredientes(Ingredientes ingredientesNecesarios) {
        for (String ingrediente : ingredientesNecesarios.ingredientes.keySet()) {
            int cantidadNecesaria = ingredientesNecesarios.ingredientes.get(ingrediente);
            if (!ingredientes.containsKey(ingrediente) || ingredientes.get(ingrediente) < cantidadNecesaria) {
                return false;
            }
        }
        return true;
    }
}
