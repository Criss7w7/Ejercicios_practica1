public class Ejercicio4_sem1 {
    public static void main(String[] args) {

   double AFPT, AFPE, pagoAFP, pagoT, pagoF, sueldo ;


        sueldo= 500;
        AFPT= 0.06;
        AFPE = 0.065;
        pagoAFP = sueldo* AFPT;

            pagoT = sueldo * AFPE; pagoF = pagoAFP + pagoT;

        System.out.println("Usted esta pagando a AFP la cantidad de:" + pagoF);
    }

}
