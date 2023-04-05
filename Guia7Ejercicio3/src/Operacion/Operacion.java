/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
*/

package Operacion;

import java.util.Scanner;

public class Operacion {
 
    private int num1;
    private int num2;

/* a) Método constructor con todos los atributos pasados por parámetro.*/
    
    public Operacion(int num1, int num2) {
//        this.setNum1(num1);
//        this.setNum2(num2);
        this.num1 = num1;
        this.num2 = num2;
    }
    
/* b) Método constructor sin los atributos pasados por parámetro.*/
    public Operacion() {
    }

    /* c) Métodos get y set.*/
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

/* d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto. */
    public void crearOperacion(Scanner leer, int num1, int num2){
        System.out.println("Ingrese el primer valor entero");
        this.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo valor entero");
        this.setNum2(leer.nextInt());
    }

/* Método sumar(): calcular la suma de los números y devolver el
resultado al main. */
    public int Sumar(int num1, int num2) {

        int suma = num1 + num2;
        return suma;
    }

/* f) Método restar(): calcular la resta de los números y devolver el
resultado al main */
    public int Restar(int num1, int num2) {

        int resta = num1 - num2;
        return resta;
    }

/* g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main */
    public int Multiplicar(int num1, int num2) {
        int multi;
        if (num1 ==0 || num2 ==0){
            System.out.println("Error un numero es igual a cero");
            return 0;
        } else {
             multi = num1 * num2;
        }
        return multi;
    }

/* h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main. */
    public int Dividir(int num1, int num2) {

       int divi;
        if (num2 ==0){
            System.out.println("Error no se puede dividir por cero");
            return 0;
        } else {
             divi = num1 / num2;
        }
        return divi;
    }
}