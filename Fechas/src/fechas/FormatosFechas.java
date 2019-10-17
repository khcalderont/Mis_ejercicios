//Autor: Kebin Humberto Calderón - ADSI 1802853
package fechas;

import java.util.Calendar;

public class FormatosFechas {

    
    public static void main(String[] args) {
    
        Calendar FormatoFecha = Calendar.getInstance();
        
        //Para obbtener la fecha en este formato:
        // =>  jue oct 17 11:43:33 COT 2019
        System.out.printf("%tc\n", FormatoFecha);
        
        //Para obbtener la fecha en este formato:
        // => 2019-10-17
        System.out.printf("%tF\n", FormatoFecha);
        
        //Para obbtener la fecha en este formato:
        // =>  10/17/19
        System.out.printf("%tD\n", FormatoFecha);
        
        //Para obbtener la fecha en este formato:
        // =>   11:43:52 AM
        System.out.printf("%tr\n", FormatoFecha);
        
        //Para obbtener la fecha en este formato:
        // => 11:43:52
        System.out.printf("%tT\n", FormatoFecha);
        
        //Para obbtener la fecha en este formato:
        // => 
        System.out.printf("%l$tA, %l$tB %l$td, %l$tY/n", FormatoFecha);
        
    }
    
}
