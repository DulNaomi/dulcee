/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio9 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

       System.out.println("Introduce una cadena:");
       String cadena = scanner.nextLine();

       System.out.println("Introduce el carácter a buscar:");
       char caracter = scanner.next().charAt(0);

       int contador = 0;
       for (int i = 0; i < cadena.length(); i++) {
           if (cadena.charAt(i) == caracter) {
               contador++;
           }
       }

       System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
   }
}
[5:31 p. m., 21/11/2023] Sánchez: import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Introduce una cadena:");
       String cadena = scanner.nextLine().toLowerCase();

       System.out.println("Introduce el carácter a buscar:");
       char caracter = Character.toLowerCase(scanner.next().charAt(0));

       int contador = 0;
       for (int i = 0; i < cadena.length(); i++) {
           if (cadena.charAt(i) == caracter) {
               contador++;
           }
       }

       System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
   }
}
   }
   
}
