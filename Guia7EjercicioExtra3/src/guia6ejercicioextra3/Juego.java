
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

import java.util.Random;
import java.util.Scanner;

public class Juego {

    private final int intentosMaximos;
    private int jugador1Victorias;
    private int jugador2Victorias;

    public Juego(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
        this.jugador1Victorias = 0;
        this.jugador2Victorias = 0;
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Jugador 1, elige un número entre 1 y 100:");
        int numeroElegido = scanner.nextInt();

        System.out.println("Jugador 2, intenta adivinar el número en " + intentosMaximos + " intentos:");

        for (int i = 1; i <= intentosMaximos; i++) {
            System.out.println("Intento #" + i + ":");
            int intento = scanner.nextInt();
            if (intento == numeroElegido) {
                System.out.println("¡Adivinaste el número en " + i + " intentos!");
                jugador2Victorias++;
                return;
            } else if (intento < numeroElegido) {
                System.out.println("El número es más alto.");
            } else {
                System.out.println("El número es más bajo.");
            }
        }

        System.out.println("Se acabaron los intentos. El número era " + numeroElegido + ".");
        jugador1Victorias++;
    }

    public int getJugador1Victorias() {
        return jugador1Victorias;
    }

    public int getJugador2Victorias() {
        return jugador2Victorias;
    }
}
