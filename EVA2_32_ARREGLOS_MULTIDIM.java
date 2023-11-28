/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_32_arreglos_multidim;

/**
 *
 * @author invitado
 */
public class EVA2_32_ARREGLOS_MULTIDIM {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[][] matriz = new int[3][4];
        //PONER DATOS MANUALES
        matriz[1][3] = 100;
        System.out.println("matriz[1][3] = " + matriz[1][3]);
        //---------------------
        System.out.println(matriz.length);
      for (int[] matriz1 : matriz) {
         //POR CADA FILA, DEBO RECORRER CADA COLUMNA
         //COLUMNAS
         for (int j = 0; j < matriz1.length; j++) {
            matriz1[j] = (int)(Math.random()*100);
         }
         for (int[] matriz2 : matriz) {
            //POR CADA FILA, DEBO RECORRER CADA COLUMNA
            //COLUMNAS
            for (int j = 0; j < matriz2.length; j++) {
               System.out.print("[" + matriz2[j] + "]");
            }
            System.out.println("");
         }
    }
}
   