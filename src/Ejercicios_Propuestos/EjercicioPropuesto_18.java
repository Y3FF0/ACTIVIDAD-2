package Ejercicios_Propuestos;/* . Se tiene la siguiente información de un empleado:
 · código del empleado,
 · nombres,
 · número de horas trabajadas al mes,
 · valor hora trabajada,
 · porcentaje de retención en la fuente.
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto. */

import java.util.Scanner;

public class EjercicioPropuesto_18 {

    public static void main(String [] args){
        Scanner variable = new Scanner(System.in);

        System.out.println("Ingrese el código del empleado: ");
        int codEmpleado = variable.nextInt();

        System.out.println("Ingrese el Nombre del empleado: ");
        String nombre = variable.next();

        System.out.println("Ingrese el número de horas trabajadas: ");
        double horasTrabajo = variable.nextDouble();

        System.out.println("Ingrese el valor de las horas trabajadas: ");
        double salarioHora = variable.nextDouble();

        System.out.println("Ingrese el valor del porcentaje de retención de la fuente: ");
        double porcentajeRetencion = variable.nextDouble();

        double salarioBruto = horasTrabajo * salarioHora;
        double retencionFuente = salarioBruto * porcentajeRetencion;
        double salarioNeto = salarioBruto - retencionFuente;

        System.out.println("El código del empleado es: " + codEmpleado);
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El salario bruto es: " + salarioBruto);
        System.out.println("El salario neto es: " + salarioNeto);

    }
}
