//Autor: Kebin Humberto Calderón - ADSI 1802853
package fechas;

import java.util.Scanner;

public class Fechas {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    String DiaTexto = "";
    String MesTexto = "";
    String AnyoTexto = "";
    int Dia = 0;
    int Mes = 0;
    int Anyo = 0;
    
    System.out.println("VALIDACIÓN DE FECHAS");
    System.out.println("");
    System.out.println("Por favor, ingrese en números el día de nacimiento: ");
    DiaTexto = input.next();
    System.out.println("Por favor, ingrese en números el mes de nacimiento: ");
    MesTexto = input.next();
    System.out.println("Por favor, ingrese en números el año de nacimiento: ");
    AnyoTexto = input.next();
    }
}
 