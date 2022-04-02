
package ejercicio1_semana1;
  
  public  class  Ejercicio3_sem1 {
    
public  static  void  main ( String [] args ) {

// Declaración de variables

  double salarioTL, renta, rentaTL,sueldoxH, hora, total;


     sueldoxH =  8 ;
     hora =  36 ;
     renta =  0.10 ;

     salarioTL = sueldoxH * hora;
     rentaTL = salarioTL * renta;
     total = salarioTL - rentaTL;


     sistema_fuera_println( " El salario total es: "  + total);
   }

    private static void sistema_fuera_println(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}