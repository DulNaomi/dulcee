/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //captura de calificacion 
 int califa;
Scanner input = new Scanner(System.in);
System.out.println("introduce calificación: ");
califa = input.nextInt();

//vamos evaluar

if((califa >= 90) && (califa <= 100)) 
            System.out.println("A");
else if((califa >= 80) && (califa <= 89))
            System.out.println("B");
else if((califa >= 70) && (califa <= 79))
            System.out.println("C");
else if((califa >= 60) && (califa <= 69))
            System.out.println("D");
else if((califa >= 60))
            System.out.println("F");

    }
    
}
