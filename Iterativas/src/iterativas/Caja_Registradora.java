// Autor: Kebin Humberto Calderón

package iterativas;

import java.util.Scanner;

class Caja_Registradora {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //int cliente= 0;
        int Cuaderno_Anillado = 5600 ;
        int Micropunta= 1400;
        int Colores_NORMA_DOblePunta= 24700;
        int Marcador_Permanente= 2500;
        int Kit_Geométrico= 4200;
        int codigo= 0;
        int cantidad= 0;
        //int valor= 0;             
        int total= 0;
        int valort= 0;
        String respuesta= "" ;
        
        System.out.println("                     ...::PRODUCTOS DISPONIBLES::...");
        
        System.out.println("Nombre                             Código                   Valor");
        
        System.out.println("Cuaderno Anillado                    01                     5.600");
        System.out.println("Micropunta                           02                     1.400");
        System.out.println("Colores NORMA DOblePunta             03                     24.700");
        System.out.println("Marcador Permanente                  04                     2.500");
        System.out.println("Kit Geométrico                       05                     4.200");
        
        System.out.println("Deseas comprar alguno de nuestros productos..? (Si/No)");
        
        while (respuesta.equals("Si")){
            
            System.out.println("Por favor, ingresa el código del producto que deseas comprar: ");
        codigo = input.nextInt();
        
        System.out.println("Por favor, ingresa la cantidad del producto que deseas comprar: ");
        cantidad = input.nextInt(); 
            switch (codigo) {                
                case 1:
                    total= cantidad * Cuaderno_Anillado;
                    valort+= total;
                    break;
                case 2:
                    total= cantidad * Micropunta;
                    valort+= total;
                    break;
                case 3:
                    total= cantidad * Colores_NORMA_DOblePunta;
                    valort+= total;
                    break;
                case 4:
                    total= cantidad * Marcador_Permanente;
                    valort+= total;
                    break;
                case 5:
                    total= cantidad * Kit_Geométrico;
                    valort+= total;
                    break;
                default:
                    System.out.println("Por favor, ingresa un codigo válido: ");
            }
        }
    }
}




