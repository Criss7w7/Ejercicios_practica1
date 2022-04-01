package ejercicio3_sem1;
public class Ejercicio3_sem1 {
    
public static void main(String[] args) {

//Declaracion de las variables

  double SalarioTL, Renta, RentaTL,SueldoxH, Hora,  Total;


     SueldoxH = 8;
     Hora = 36;
     Renta = 0.10;

     SalarioTL= SueldoxH * Hora;
     RentaTL = SalarioTL * Renta;
     Total = SalarioTL - RentaTL;


     System.out.println("El salario total es:" + Total);
   }
}

