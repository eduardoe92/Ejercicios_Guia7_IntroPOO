/**
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */

package guia6ejercicioextra3;

import java.util.Scanner;

public class Guia6EjercicioExtra3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido al juego de adivinanza de números!");

    System.out.println("Ingrese el número máximo de intentos permitidos:");
    int intentosMaximos = scanner.nextInt();

    Juego juego = new Juego(intentosMaximos);

    boolean seguirJugando = true;

    while (seguirJugando) {
        juego.iniciarJuego();

        System.out.println("Jugador 1: " + juego.getJugador1Victorias() + " victorias");
        System.out.println("Jugador 2: " + juego.getJugador2Victorias() + " victorias");

        System.out.println("¿Quieres seguir jugando? (S/N)");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("N")) {
            seguirJugando = false;
        }
    }

    System.out.println("Gracias por jugar!");
}
}
