/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio7 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa números positivos (o cero). Introduce un número negativo para terminar.");

        int numero;
        int numeroMaximo = Integer.MIN_VALUE;
        int numeroMinimo = Integer.MAX_VALUE;

        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero > numeroMaximo) {
                    numeroMaximo = numero;
                }

                if (numero < numeroMinimo) {
                    numeroMinimo = numero;
                }
            }

        } while (numero >= 0);

        if (numeroMinimo != Integer.MAX_VALUE) {
            System.out.println("El número más pequeño es: " + numeroMinimo);
            System.out.println("El número más grande es: " + numeroMaximo);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
    }
   
}
