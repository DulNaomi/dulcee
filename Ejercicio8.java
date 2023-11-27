/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio8 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner sc = new Scanner(System.in);
        char letra;
        
        System.out.println("digite una letra: ");
        letra = sc.next().charAt(0);
        
        
        switch (letra) {
            case 'a':
            case'e':
            case'i':
            case'o':
            case'u':
                System.out.println("es vocal");
               break;
                
            case'b':
                case'c':
                case'd':
                case'f':
                case'g':
                case'h':
                case'j':
                case'k':
                case'l':
                case'm':
                case'n':
                case'ñ':
                case'q':
                case'r':
                case's':
                case't':
                case'v':
                case'w':
                case'y':
                case'z':
                    System.out.println("es consonante");
                    break;
             
                
                
            
        }
        
   }
   
}
