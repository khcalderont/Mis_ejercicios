// Autor: Kebin Humberto Calderón

package operadoresaritmeticoskc;

import java.util.Scanner;


public class CalculadoraKC {
   public static void main(String [] args){
       
       Scanner input = new Scanner (System.in);
       
       //Declaramos e inicializamos variables.   
       int Numero1 = 0;
       int Numero2 = 0;
       int Resultado = 0;
       int TipoOperación = 0;
       
       //Mostramos las opciones al usuario para que elija  una.
       System.out.println("Seleccione el tipo de operación que necesita: ");
       System.out.println("1. Suma");
       System.out.println("2. Resta");
       System.out.println("3. Multiplicación");
       System.out.println("4. División");
       
       TipoOperación = input.nextInt();
       
       if (TipoOperación > 0  && TipoOperación < 5) {
       
           if (TipoOperación == 1){
           System.out.println("Usted ha seleccionado una Suma. ");
                System.out.print("Ingrese el primer número: ");
                Numero1 = input.nextInt();

                System.out.print("Ingrese el segundo número: ");
                Numero2 = input.nextInt();
                 
                Resultado = Numero1 + Numero2;}
            
                else if (TipoOperación == 2) {
           
           System.out.println("Usted ha seleccionado una Resta. ");
                System.out.print("Ingrese el primer número: ");
                Numero1 = input.nextInt();

                System.out.print("Ingrese el segundo número: ");
                Numero2 = input.nextInt();
                 
                Resultado = Numero1 - Numero2;
                }
                        else if (TipoOperación == 3) {
           
                        System.out.println("Usted ha seleccionado una Multiplicación. ");
                             System.out.print("Ingrese el primer número: ");
                             Numero1 = input.nextInt();

                             System.out.print("Ingrese el segundo número: ");
                             Numero2 = input.nextInt();

                             Resultado = Numero1 * Numero2;
                 
                        }
                     
           
           else if (TipoOperación == 4) {
           
           System.out.println("Usted ha seleccionado una División. ");
                System.out.print("Ingrese el primer número: ");
                Numero1 = input.nextInt();

                System.out.print("Ingrese el segundo número: ");
                Numero2 = input.nextInt();
                 
                Resultado = Numero1 / Numero2;
                }
       
            
           
           else if (TipoOperación == 3) {
           
           System.out.println("Usted ha seleccionado una Multiplicación. ");
                System.out.print("Ingrese el primer número: ");
                Numero1 = input.nextInt();

                System.out.print("Ingrese el segundo número: ");
                Numero2 = input.nextInt();
                 
                Resultado = Numero1 * Numero2;
       }
        System.out.println("El resultado de la operación es: " + Resultado); 
                  
       }
       else {
         System.out.println("Seleccione una opción válida");
              }
       
   }  
}

