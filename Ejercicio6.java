/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio6 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numeroDecimal = scanner.nextInt();

        String binario = convertirABinario(numeroDecimal);

        System.out.println("El equivalente en binario es: " + binario);
    }

    private static String convertirABinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            binario.insert(0, residuo);
            numeroDecimal /= 2;
        }

        return binario.toString();
    }
   
}
