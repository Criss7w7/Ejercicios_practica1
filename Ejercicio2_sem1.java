package ejercicio2_sem1;

public class Ejercicio2_sem1 {
  public static void main(String[] args) {
   //declaramos las variables
    double  dolares, europa, reino_u, australia, canada, usd;
    
    //Establecemos valores a las variables
    dolares = 100;
    europa = 0.70;
    reino_u = 0.61;
    australia = 0.95;
    canada = 0.97;
    usd = 1.00;
    
      //realizamos  conversion
      double conversion1 = dolares * europa;
      System.out.println("La covensercion de Dolares a la moneda de Europa es : " + conversion1); 
      double conversion2 = dolares * reino_u;
      System.out.println("La covensercion de Dolares a la moneda de Reino Unido es : " + conversion2); 
      double conversion3 = dolares * australia;
      System.out.println("La covensercion de dolares a la moneda de Australia es : " + conversion3); 
      double conversion4 = dolares * canada;
      System.out.println("La covensercion de dolares a la moneda de Canada es : " + conversion4); 
      double conversion5 = dolares * usd;
      System.out.println("La covensercion de dolares a la moneda  de USD es : " + conversion5); 
    
    
  } 
}
