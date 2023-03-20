package Ejercicios_Resueltos;

import java.util.Scanner;

public class EjercicioResuelto_11 {

    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese su primer numero:");
        int N1= leer.nextInt();

        System.out.println("Ingrese su segundo numero:");
        int N2= leer.nextInt();

        System.out.println("Ingrese su tercer numero: ");
        int N3= leer.nextInt();

        if (N1>N2 && N1>N3){
            System.out.println("EL VALOR MAYOR ENTRE: "+ N1+ ", "+N2+ " Y "+N3+ " ES: "+ N1);
        }
        else {

            if(N2>N3){
                System.out.println("EL VALOR MAYOR ENTRE: "+ N1+ ", "+N2+ " Y "+N3+ " ES: "+ N2);

            }
            else{
                System.out.println("EL VALOR MAYOR ENTRE: "+ N1+ ", "+N2+ " Y "+N3+ " ES: "+ N3);

            }

        }
    }
}
