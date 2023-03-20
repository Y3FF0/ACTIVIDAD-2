package Ejercicios_Resueltos;

import java.util.Scanner;

public class EjercicioResuelto_14 {

    public static void main(String[] args) {

        double Salar1;
        double Salar2;
        double Salar3;
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese Ventas del departamento 1");
        int VD1=leer.nextInt();

        System.out.println("Ingrese Ventas del departamento 2");
        int VD2=leer.nextInt();

        System.out.println("Ingrese Ventas del departamento 3");
        int VD3=leer.nextInt();

        System.out.println("Ingrese Salario");
        float SALAR=leer.nextInt();


        var TOTVEN=VD1+VD2+VD3;
        var PORVEN=0.33*TOTVEN;

        if(VD1>PORVEN){
            Salar1=(SALAR*0.2)+SALAR;

        }else{
            Salar1=SALAR;


            if (VD2>PORVEN){

                Salar2= SALAR+(0.2*SALAR);

            }else{
                Salar2=SALAR;
            }

            if (VD3>PORVEN){

                Salar3= SALAR+(0.2*SALAR);

            }else{
                Salar3=SALAR;
            }

            System.out.println("SALARIO DEL DEPTO 1: "+Salar1);
            System.out.println("SALARIO DEL DEPTO 2: "+Salar2);
            System.out.println("SALARIO DEL DEPTO 3: "+Salar3);
        }
    }
}
