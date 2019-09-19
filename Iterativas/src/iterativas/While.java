// Autor: Kebin Humberto Calderón

package iterativas;

import java.util.Scanner;

public class While {
   
    public static void main(String[] args) {
        // Condicional While    
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("===REGISTRO DE PARTICIPANTES===");
        System.out.println("Cupo máximo: 3 Participantes");
        
        int Npart = 0;
        String Ndoc = "";
        
            while(Npart <= 3){
                System.out.println("Participante N° " + Npart);
                System.out.println("Por favor, ingrese su número de documento: ");
                
                Ndoc = entrada.nextLine();
                Npart++;
        }
            System.out.println( "Se ha terminado el cupo.");
            System.out.println( "Fin del Ejercicio.");
    }
    
}
