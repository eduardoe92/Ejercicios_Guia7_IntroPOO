/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el
 * aumento salarial de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30
 * años o del 5% si tiene menos de 30 años.
 */
package Entidades;

public class Empleado {
    
    private String nombre;
    private int edad;
    private float salario;
    private float salarioFinal;

    public Empleado() {
    }
    
    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    public float calcular_aumento() {
        if (this.edad >= 30) {
            salarioFinal = (float) (this.salario * 1.1);
        } else {
            salarioFinal = (float) (this.salario * 1.05);
        }
        this.salario = salarioFinal;
        return salarioFinal;
    }
    
    public String toString() {
        return "El empleado: " + nombre + ". \nTiene una edad de: " + edad + " años. \nSu próximo pago con el aumento será de: $" + salarioFinal;
    }
}
