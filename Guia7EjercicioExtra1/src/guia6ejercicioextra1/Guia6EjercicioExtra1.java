/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá́definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
*/

package guia6ejercicioextra1;

import Cancion.Cancion;
import java.util.Scanner;

public class Guia6EjercicioExtra1 {

        Scanner leer = new Scanner(System.in);
    
        public static void main(String[] args) {
        Cancion ca = new Cancion();
        ca.crearCancion();
        System.out.println(ca);
    }
}
