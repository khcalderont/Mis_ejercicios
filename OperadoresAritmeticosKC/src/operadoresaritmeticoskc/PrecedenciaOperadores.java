// Autor: Kebin Humberto Calderón

package operadoresaritmeticoskc;


public class PrecedenciaOperadores {
    
    public static void main(String[]args){
        System.out.println("===Operaciones===");
        
        int Resultado = ((3 + 5) * 2) - 4;
        
        System.out.println("El resultado de la operación es: " + Resultado);
        System.out.println("");
        // SUmar las notas de los 3 estudiantes y obtener le promedio de estas. Hacerlo en uns línea
        // teniendo en cuenta la precedencia de operadores y el uso de paréntesis.
        //Al final mostrar el resultado del promedio.
        double Nota1 = 5;
        double Nota2 = 8;
        double Nota3 = 4;
        double Promedio =0;
        
        Promedio = (Nota1 + Nota2 + Nota3)/3;
        
        System.out.println("El promedio de las notas dadas es " + Promedio);
        System.out.println("");
        
        //Una Institución educativa cuenta con 3 sedes y cada sede cuenta con un número determinado de estudiantes.
        //Teniendo en cuenta el total de  estudiantes se entregarán 3 boletas a cada uno, 
        //¿Cuántas boletas es necesario imprimir? Hacer la operacion en una línea.
        
        int Sede1 = 85 ;
        int Sede2= 64 ;
        int Sede3= 97;
        int Total = 0;
        int suma = 0;
        
        suma = Sede1 + Sede2 + Sede3;
        Total = (Sede1 * 3) + (Sede2 * 3) + (Sede3 * 3);
        
        System.out.println("La cantidad de boletas que se necesitaría imprimir para los " + suma + " estudiantes de las 3 sedes, será: " + Total);
    }
}
