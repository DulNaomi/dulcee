/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva22_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA22_DO_WHILE {
final static String NOMBRE_USUARIO = "Admin";
final static String PASSWORD = "Admin";
        
    public static void main(String[] args) {
        String usuario;
        String pwd;
        Scanner nono=new Scanner(System.in );
        
        do{
            System.out.println("introduce el usuario");
            usuario=nono.nextLine();
            System.out.println("introduce el contrasena");
            pwd=nono.nextLine();
        }while((!usuario.equals(NOMBRE_USUARIO)) || (!pwd.equals(PASSWORD)));
    }
    
}
