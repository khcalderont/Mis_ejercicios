//Autor: Kebin Humberto Calderón

package operadoresaritmeticoskc;

import java.util.Scanner;

public class OperadoresLogicos {
    
       public static void main(String [] args){
       
       Scanner input = new Scanner (System.in);
       
       String Sede = "";
       int Dia = 0;
       double ValorCompra = 0;
       int Edad = 0;
       
       System.out.println("::--FACTURACIÓN DE ALMACÉN--::");
       System.out.print("Ingrese la sede del almacén: ");
       Sede = input.next();
       System.out.print("Ingrese el valor de su compra: ");
       ValorCompra = input.nextInt();
       System.out.print("Ingrese día de facturación: ");
       Dia = input.nextInt();
       System.out.print("Ingrese la edad: ");
       Edad = input.nextInt();
       
       if (!Sede.equals("Bogota")){
           System.out.println("Los descuentos no aplican para esta sede.");
       }
       else if(Dia == 15 || Dia == 30){
           ValorCompra = ValorCompra * 0.90;
           System.out.println("Felicitaciones! Has logrado un descento del 10% en tus compras.");
       }
       else if(Dia == 5 && Edad >= 65){
           ValorCompra = ValorCompra * 0.95;
           System.out.println("Felicitaciones! Has logrado un descento del 5% en tus compras.");
       }
       System.out.println("El valor total de su compra es de $" + ValorCompra);
        }
}
