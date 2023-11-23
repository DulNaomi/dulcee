/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
            System.out.println("digite un numero: ");
            float a = sc.nextFloat();
            
            
            
            if(a<0){
                System.out.println("el numero "+a+" es negativo");
            }else {
                if(a==0){ 
                System.out.println("el numero es 0");
            }else{
                    
                    System.out.println("el numero "+a+" es positivo");   
                    
                }
                
         }
            
