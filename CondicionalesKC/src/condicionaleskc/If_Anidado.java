// Autor: Kebin Calderón Toro

package condicionaleskc;

import java.util.Scanner;

public class If_Anidado {
    
    public static void main(String[] args){
        //COndicional If_Anidado
        //Crear un algoritmo que me indique si la contraseña y ususario ingresad son correctos o incorrectos
        
        Scanner input = new Scanner (System.in);
        
        String UserSystem = "Kebin";
        String PassSystem = "1234";
        String UserIngresado = "";
        String PassIngresada = "";
        
        System.out.println("Por favor ingrese su nombre de usuario");
        UserIngresado = input.nextLine();
        
        if (UserIngresado.equals(UserSystem)){
            System.out.println("Por favor ingrese contraseña");
            PassIngresada = input.nextLine();
             if (PassIngresada.equals(PassSystem)){
            System.out.println("Bienvenido!!");
            }
            else {
            System.out.println("Contraseña incorrecta, por favor intenta de nuevo ");
        }   
        }
        else {
            System.out.println("Usuario incorrecto, por favor intenta de nuevo ");
        }
    
    }
}


