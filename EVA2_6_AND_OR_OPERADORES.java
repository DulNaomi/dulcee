/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {
   //CAPTURA LA CALIFICACIÓN
   int califa;
   Scanner input = new Scanner(System.in);
   System.out.println("Introduce la calificación: ");
   califa = input.nextInt();
   
   
   //VAMOS A EVALUAR:
   if((califa >= 0)&& (califa <= 100)){
   System.out.println("la calificacion " + califa + " es válida!!");
   if(califa >= 70)
      System.out.println("Acreditas!!");
   else
      System.out.println("No acreditas!!");
}else
 System.out.println("la calificación " + califa +"  NO es válida!!");
            
}
           
   
}
