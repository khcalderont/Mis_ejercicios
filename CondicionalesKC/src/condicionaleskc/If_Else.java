//Autor: Kebin Humberto Calderón
package condicionaleskc;
    
import java.util.Scanner;

public class If_Else {
    
    public static void main(String[] args){
        //Cndicional If_Else
        //Crear un algoritmo que me indique si la contraseña ingresada es correcta o incorrecta
        
        Scanner input = new Scanner (System.in);
        
        String PassSystem = "1234";
        String PassIngresada = "";
        System.out.println("Por favor ingrese su contraseña");
        
        PassIngresada = input.nextLine();
        
        if (PassIngresada.equals(PassSystem)){
            System.out.println("Bienvenido!!");
        }
            else {
            System.out.println("Contraseña incorrecta, por favor intenta de nuevo ");
        }
      }
        
    }    

