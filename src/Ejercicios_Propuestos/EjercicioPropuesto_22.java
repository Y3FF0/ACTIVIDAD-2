package Ejercicios_Propuestos;/*Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre. */

import java.util.Scanner;

public class EjercicioPropuesto_22 {

    public static void main(String [] args){
        Scanner variable = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del empleado: ");
        String nombre = variable.nextLine();

        System.out.println("Ingrese el valor del salario basico por hora: ");
        double salarioHora = variable.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas: ");
        double horasTrabajo = variable.nextDouble();

        if ((horasTrabajo*salarioHora) > 450000) {
            System.out.println("Este es el nombre del empleado:" + nombre);
            System.out.println("Este es su salario mensual:" + horasTrabajo*salarioHora);

        } else {
            System.out.println("Este es el nombre del empleado:" + nombre);
        }

    }

}
