/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

/**
 *
 * @author invitado
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        import java.util.Scanner;

public class CalcularPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base (número entero positivo): ");
        int base = scanner.nextInt();

        System.out.print("Ingresa el exponente (número entero positivo): ");
        int exponente = scanner.nextInt();

        int resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }

    private static int calcularPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
    
}
