/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_28_uso_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_28_USO_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
        int cant;
        int[] califas;//aqui no existe el arreglo
        
        System.out.println("Cuantas calificaciones quieres capturar?");
        cant = input.nextInt();
        //ya que sabemos cuantas califas necesitamos, creamos el arreglo
        califas = new int[cant];
        
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Introduce la calificacion:");
            califas[i] = input.nextInt();
        
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("[" + califas[i] + "]");
        }
            
   }
   
}
