/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 *
 * @author invitado
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input = new Scanner(System.in);
        System.out.println("    ingrese el primer numero entereo positivo");
        int num1 = input.nextInt();
        System.out.println("ingrese el segundo numero entero positivo");
       int num2 = input.nextInt();
        System.out.println("numero entero" + num1 +"y"+ num2 + "en orden ascedente");
        if (num1 <= num2){
            for (int i= num1; i<= num2; i++){
                System.out.println(i + "");
                
            }
        } else { System.out.println("el primer numero debe de ser igual o menor al segundo");

    }
    }
    
}
