package Ejercicios_Resueltos;

import java.util.Scanner;

public class EjercicioResuelto_15 {

    public static void main(String [] args){
        Scanner variable = new Scanner(System.in);

        System.out.println("Ingrese el peso A: ");
        double pesoA = variable.nextDouble();

        System.out.println("Ingrese el peso B: ");
        double pesoB = variable.nextDouble();

        System.out.println("Ingrese el peso C: ");
        double pesoC = variable.nextDouble();

        System.out.println("Ingrese el peso D: ");
        double pesoD = variable.nextDouble();

        if (pesoA == pesoB && pesoA == pesoC){
            System.out.println("La esfera D es de peso diferente");
            if (pesoD > pesoA) {
                System.out.println("La esfera D es de mayor peso");
        } else {
                System.out.println("La esfera D es de menor peso");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es de peso diferente.");
            if (pesoC > pesoA) {
                System.out.println("La esfera C es de mayor peso");
            } else {
                System.out.println("La esfera C es de menor peso");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("La esfera B es de peso diferente.");
            if (pesoB > pesoD) {
                System.out.println("La esfera B es de mayor peso");
            } else {
                System.out.println("La esfera B es de menor peso");
            }
        } else {
            System.out.println("La esfera A es de peso diferente");
            if (pesoA > pesoB) {
                System.out.println("La esfera A es de mayor peso");
            } else {
                System.out.println("La esfera A es de menor peso");
            }
        }

    }

}
