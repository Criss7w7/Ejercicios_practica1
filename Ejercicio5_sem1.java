package ejercicio5_sem1;
public class Ejercicio5_sem1 {
    
    public static void main(String[] args) {
        
  double salarioT, sueldo, horas, sueldoH, horasT, renta, rentaT, tiempo, totalF;

         sueldo= 10;
         tiempo= 30;
         horas= 50;
         sueldoH = 0.10;
         renta= 0.10;
         
         salarioT = sueldo* tiempo;
         horasT = horas * sueldoH;
         totalF= salarioT + horasT;
         rentaT= totalF - renta;
      

       System.out.println("Su Salario Total es:" + rentaT);

    }
    
    
}
