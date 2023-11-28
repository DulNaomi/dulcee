/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_33_cubo;

/**
 *
 * @author invitado
 */
public class EVA2_33_CUBO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
       System.out.println("Hello World!");
        int[][][] cubo = new int [3][4][6];
        
      for (int[][] cubo1 : cubo) {
          for (int[] cubo11 : cubo1) {
             for (int k = 0; k < cubo11.length; k++) {
                cubo11[k] = (int)(Math.random() * 100);
             }
          }
      }
      for (int[][] cubo1 : cubo) {
          for (int[] cubo11 : cubo1) {
             for (int k = 0; k < cubo11.length; k++) {
                System.out.print("[" + cubo11[k] + "]");
             }
             System.out.println("");
          }
         System.out.println("");
      }
    }
}