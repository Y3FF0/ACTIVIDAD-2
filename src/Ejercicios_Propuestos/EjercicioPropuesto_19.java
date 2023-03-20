package Ejercicios_Propuestos;/*Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo.*/


import java.util.Scanner;
import java.lang.Math;

public class EjercicioPropuesto_19 {

    public static void main(String [] args){
        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del triangulo equilatero del empleado: ");
        double lado = valor.nextDouble();

        double perimetro = lado * 3;
        double altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(lado/2,2));
        double area = (lado * altura)/2;


        System.out.println("El perimetro del triangulo es: " + perimetro);
        System.out.println("La altura del triangulo es: " + altura);
        System.out.println("El area del triangulo es: " + area);

    }
}
