package Ejercicios_Propuestos;/*Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. */

import java.util.Scanner;

public class EjercicioPropuesto_23 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los valores de A, B y C: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;
        double x1, x2;

        if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            x1 = -b / (2 * a);
            System.out.println("La solución es: " + x1);
        } else {
            System.out.println("No hay soluciones reales");
        }

    }

    }
