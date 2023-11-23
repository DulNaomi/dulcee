/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio3 {

    private static Scanner Scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner = new Scanner(System.in);
        System.out.print("ingresa el primer numero positivo entero");
        int numero1 = Scanner.nextInt();
        
        System.out.print("ingresa el segundo numero positivo entero ");
        int numero2 = Scanner.nextInt();
        
        
        int numeroinicial = Math.min(numero1,numero2);
        int numerofinal = Math.max(numero1,numero2);
        
        System.out.println("los numeros pares entre" + numeroinicial );
        for(int i =numeroinicial; i <= numerofinal; i++){
            if(i% 2 == 0){
                System.out.print(i + " ");
            }
        }
        
    }
    
}
    
