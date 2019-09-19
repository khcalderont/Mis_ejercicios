//Autor: Kebin Humberto Calderón
package condicionaleskc;

import java.util.Scanner;

public class If {
    
    public static void main(String[] args){
        //Condicional If
        //Crear un algoritmo que me indique si la contraseña ingresada es correcta o incorrecta
        
        Scanner input = new Scanner (System.in);
        
        String PassSystem = "1234";
        String PassIngresada = "";
        System.out.println("Por favor ingrese su contraseña");
        
        PassIngresada = input.nextLine();
        
        if (PassIngresada.equals(PassSystem)){
            System.out.println("Bienvenido!!");
        }
        
    }    
}
