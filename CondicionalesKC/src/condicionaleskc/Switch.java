// Autor: Kebin Humberto Calderó

package condicionaleskc;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
  
int Nestudiantes = 0;
int Nota = 0;

        System.out.println("===REGISTRO DE CALIFICACIONES===");
        
        System.out.println("Ingresa el número de estudiantes: ");
        Nestudiantes = input.nextInt();
        
        System.out.println("Ingresa la nota del estudiante: ");
        Nota = input.nextInt();
        
        switch(Nota){
            case 10: 
            case 9: 
                System.out.println("Excelente");
                break;
            case 8: 
            case 7: 
            case 6:
                System.out.println("Bueno");
                break;
            case 5: 
            case 4: 
                System.out.println("Regular");
                break;
            case 3: 
            case 2: 
            case 1: 
                System.out.println("Malo");
                break;
            default:
                System.out.println("Ingresa una calificación válida.");
                break;
        }
        
    }
}
