/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_CICLOS_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int nume;
        Scanner nono=new Scanner (System.in);
        System.out.println("introduce un numero");
        nume=nono.nextInt();
        
        for(int i=1; i<=nume; i++){
            System.out.print(i);
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");            
        }
        System.out.println("-----------");
        for (int a = nume; a >= 0; a--) {
            System.out.print(a);
            for (int b =1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
