//Autor: Kebin Humberto Calderón
package operadoresaritmeticoskc;

import java.util.Scanner;


public class OperadoresAritmeticosKC {

    public static void main(String[] args) {
               Scanner input = new Scanner (System.in);
    // SUMA
       System.out.println("====SUMA====");
       int Numero1 = 0;
       int Numero2 = 0;
       int Resultado = 0;
       
       System.out.print("Ingrese el primer número: ");
       Numero1 = input.nextInt();
       
       System.out.print("Ingrese el segundo número: ");
       Numero2 = input.nextInt();
       
       Resultado = Numero1 + Numero2;
        
       System.out.println("El resultado de la suma es: " + Resultado);
    
    //RESTA
       System.out.println("====RESTA====");
       
         System.out.print("Ingrese el primer número: ");
       Numero1 = input.nextInt();
       
       System.out.print("Ingrese el segundo número: ");
       Numero2 = input.nextInt();
       
       Resultado = Numero1 - Numero2;
        
       System.out.println("El resultado de la suma es: " + Resultado);
    //MULTIPLICACIÓN
       System.out.println("====MULTIPLICACIÓN====");
         System.out.print("Ingrese el primer número: ");
       Numero1 = input.nextInt();
       
       System.out.print("Ingrese el segundo número: ");
       Numero2 = input.nextInt();
       
       Resultado = Numero1 * Numero2;
        
       System.out.println("El resultado de la suma es: " + Resultado);
     //DIVISIÓN
       System.out.println("====DIVISIÓN====");
         System.out.print("Ingrese el primer número: ");
       Numero1 = input.nextInt();
       
       System.out.print("Ingrese el segundo número: ");
       Numero2 = input.nextInt();
       
       Resultado = Numero1 / Numero2;
        
       System.out.println("El resultado de la suma es: " + Resultado);
    }
    
}
