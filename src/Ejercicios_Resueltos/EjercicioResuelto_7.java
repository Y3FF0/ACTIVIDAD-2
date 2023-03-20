package Ejercicios_Resueltos;

import java.util.Scanner;

public class EjercicioResuelto_7 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese numero A");
        int A = leer.nextInt();

        System.out.println("Ingrese numero B");
        int B = leer.nextInt();

        if (A>B){
            System.out.println(A+" es mayor que "+B);
        }
        else {
            if (A==B){

                System.out.println(A+" es igual a "+B);

            }
            else {

                System.out.println(A+" es menor que "+B);
            }

        }

    }

}
