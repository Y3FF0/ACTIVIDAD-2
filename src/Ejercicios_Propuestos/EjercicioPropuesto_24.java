package Ejercicios_Propuestos;

import java.util.Scanner;

public class EjercicioPropuesto_24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el peso de la esfera A: ");
        double pesoA = sc.nextDouble();
        System.out.println("Introduzca el peso de la esfera B: ");
        double pesoB = sc.nextDouble();
        System.out.println("Introduzca el peso de la esfera C: ");
        double pesoC = sc.nextDouble();

        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Hay dos o más esferas con el mismo peso máximo.");
        }

    }

}
