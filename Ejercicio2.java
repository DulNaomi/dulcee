/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero positivo: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese el segundo número entero positivo: ");
        int numero2 = input.nextInt();
        System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");

        if (numero1 <= numero2) {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("El primer número debe ser menor o igual al segundo número.");
        }
    }
}
