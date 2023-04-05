
/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */

package guia6ejercicioextra5;

import java.util.Scanner;

public class Guia6EjercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = leer.nextLine();
        // leer.nextLine();
        
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = leer.nextDouble();      

        Cuenta cuenta1 = new Cuenta(saldoInicial, titular);

        System.out.println(cuenta1.getTitular() + " tiene un saldo de $" + cuenta1.getSaldo());

        boolean retirarMas = true;

        while (retirarMas) {
            System.out.print("Ingrese la cantidad de dinero a retirar: ");
            double cantidad = leer.nextDouble();

            cuenta1.retirarDinero(cantidad);

            System.out.println(cuenta1.getTitular() + " tiene un saldo de $" + cuenta1.getSaldo());

            System.out.print("¿Desea retirar más dinero? (s/n): ");
            String respuesta = leer.next();

            retirarMas = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("Operación finalizada");
    }
}