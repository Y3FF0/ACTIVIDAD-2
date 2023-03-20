package Ejercicios_Propuestos;/*Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo. */


import java.util.Scanner;
import java.lang.Math;

public class EjercicioPropuesto_21 {

    public static void main(String [] args){
        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado #1 del triangulo: ");
        double lado1 = valor.nextDouble();

        System.out.println("Ingrese el valor del lado #2 del triangulo: ");
        double lado2 = valor.nextDouble();

        System.out.println("Ingrese el valor del lado #3 del triangulo: ");
        double lado3 = valor.nextDouble();

        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = (lado1 + lado2 + lado3)/2;


        if (lado1 == lado2 && lado1 == lado3 ) {

            double altura = Math.sqrt(Math.pow(lado1, 2) - Math.pow(lado1/2,2));
            double area = (lado1 * altura)/2;

            System.out.println("El perimetro, semiperimetro y area son respectivamente:" + perimetro + ", " + semiperimetro + ", " + area);

        } else if (lado1 == lado2 | lado1 == lado3 | lado2 == lado3) {
            if (lado1 == lado2) {
                double altura = Math.sqrt(Math.pow(lado1, 2) - Math.pow(lado3 / 2, 2));
                double area = (lado3 * altura) / 2;
                System.out.println("El perimetro, semiperimetro y area son respectivamente:" + perimetro + ", " + semiperimetro + ", " + area);
            } else if (lado1 == lado3) {
                double altura = Math.sqrt(Math.pow(lado1, 2) - Math.pow(lado2 / 2, 2));
                double area = (lado2 * altura) / 2;
                System.out.println("El perimetro, semiperimetro y area son respectivamente:" + perimetro + ", " + semiperimetro + ", " + area);

            } else if (lado2 == lado3) {
                double altura = Math.sqrt(Math.pow(lado2, 2) - Math.pow(lado1 / 2, 2));
                double area = (lado1 * altura) / 2;
                System.out.println("El perimetro, semiperimetro y area son respectivamente:" + perimetro + ", " + semiperimetro + ", " + area);
            }

        }
    }
}
