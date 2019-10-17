//Autor: Kebin Humberto Calderón
package operadoresaritmeticoskc;

import java.util.Scanner;

public class OperadoresRelacionales {
    
    public static void main(String[]args){
        //Programa que indica si un número es mayor a otro
        //Primero le decimos al usuario si Número1 es igual a Número2. De no ser así,
        //Decir a usuario cuál es mayor y cuál es menor
        
        Scanner input = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        
        System.out.println("Por favor, ingrese el primer número: ");
        numero1 = input.nextInt();
        
        System.out.println("Por favor, ingrese el primer número: ");
        numero2 = input.nextInt();
        
        if (numero1 != numero2)
        {if (numero1 > numero2){
            System.out.println("El número " + numero1 + " es mayor que el número " + numero2 +".");
        }else {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero1 +".");
        }
        }else 
        {System.out.println("Los número ingresados son iguales.");
        }
       
    }
}