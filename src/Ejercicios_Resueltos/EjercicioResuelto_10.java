package Ejercicios_Resueltos;

import java.util.Scanner;

public class EjercicioResuelto_10 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("ingrese solo su nombre:");
        String NOM = leer.nextLine();

        System.out.println("Ingrese numero numero de inscripcion");
        String NI = leer.nextLine();


        System.out.println("Ingrese numero Patrimonio: ");

        int PAT = leer.nextInt();

        System.out.println("Ingrese numero estrato social: ");
        int ES = leer.nextInt();

        int PAGMAT;
        PAGMAT= 50000;

        if (ES>3 && PAT>2000000) {
            PAGMAT=(int) (PAGMAT+(0.03*PAT));
        }

        System.out.println("El estudiante con numero de inscripcion "+NI+", y nombre "+NOM+" debe pagar $"+PAGMAT);

    }
}
