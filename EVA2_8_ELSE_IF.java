/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_else_if;

/**
 *
 * @author invitado
 */
public class EVA2_8_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner nono = new Scanner (System.in);
        System.out.println("indica el numero del mez");
        int mes = nono.nextInt();
        //if((mes>=1)&&(mes<=12)){
            //System.out.println("el numero "+mes+" es un mes valido");
        switch (mes) {
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTRIEBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default:
                System.out.println("el numero "+mes+" no es un mes valido!!");
                //}else
                //System.out.println("el numero "+mes+" ni es un mes valido");
                break;
        }
        
    }
    
}
