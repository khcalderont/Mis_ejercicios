// Autor: Kebin Humberto Calderón

package iterativas;

    import java.util.Scanner;

public class Do_While {
    
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
String PassUser = "";
String PassBD = "1234";
int Intentos = 1; 

        System.out.println("===LOGIN===");
        
        do{            
            System.out.println("Ingrese la contraseña: ");
            System.out.println("Intento N° " + Intentos);
            PassUser = entrada.next();
            
            Intentos++;
            
        } while (!PassUser.equals(PassBD) && Intentos < 4);
        
            if (Intentos ==3 && !PassUser.equals(PassBD)) {
                System.out.println("Acceso NO Permitido!!");
            }
            else{
             System.out.println("Bienvenido!!");
            }
    }
    
}
  
