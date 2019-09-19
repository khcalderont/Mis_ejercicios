// Autor: Kebin Humberto Calderón

package iterativas;

import java.util.Scanner;


public class Whilemodificado {
    
    public static void main(String[] args) {
        // Condicional While    
        
        Scanner entrada = new Scanner(System.in);
        
        int max = 0;
        int Npart = 1;
        int Ndoc = 0;
        
        System.out.println("===REGISTRO DE PARTICIPANTES===");
        System.out.println("Por favor, ingrese el número de participantes a registrar: ");
            max = entrada.nextInt();
            
            System.out.println("Cupo máximo: " + max);
        
        
            while(Npart <= max){
                System.out.println("Participante N° " + Npart);
                System.out.println("Por favor, ingrese su número de documento: ");
                
                Ndoc = entrada.nextInt();
                Npart++;
        }
            System.out.println( "Se ha terminado los cupos dispinibles.");
    }
    
}
