/**
 Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */

package guia6ejercicioextra4;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Receta> listaRecetas;

    public Cocina() {
        this.listaRecetas = new ArrayList<>();
    }

    public void agregarReceta(Receta receta) {
        listaRecetas.add(receta);
    }

    public Receta buscarReceta(String nombreReceta) {
        for (Receta receta : listaRecetas) {
            if (receta.getNombre().equals(nombreReceta)) {
                return receta;
            }
        }
        return null;
    }

    public ArrayList<Receta> recetasDisponibles(Ingredientes ingredientes) {
        ArrayList<Receta> recetasDisponibles = new ArrayList<>();

        for (Receta receta : listaRecetas) {
            if (receta.puedoPreparar(ingredientes)) {
                recetasDisponibles.add(receta);
            }
        }

        return recetasDisponibles;
    }
}


