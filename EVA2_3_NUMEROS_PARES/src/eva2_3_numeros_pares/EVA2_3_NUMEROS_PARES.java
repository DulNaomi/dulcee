/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, residuo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el valor a evaluar:");
        valor = input.nextInt();
        
        residuo = valor % 2;//módulo, calcula el reesiduo.
        
        if(residuo == 0)//verdad ---> el número es par
            System.out.println("El número es par.");
        else
            System.out.println("El número es impar.");
        
    }
    
}
