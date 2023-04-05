
/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */

package guia6ejercicioextra5;

public class Cuenta {
    
    private double saldo;
    private String titular;
    
    public Cuenta(double saldoInicial, String titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar la operación");
        } else {
            saldo -= cantidad;
            System.out.println("Operación exitosa, retiraste la cantidad de $" + cantidad + ", cantidad disponible: $" +saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

