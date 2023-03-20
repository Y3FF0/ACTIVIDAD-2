package Ejercicios_Resueltos;

import java.util.Scanner;

public class EjercicioResuelto_13 {
    public static void main(String[] args) {
        float VALPAG;
        var PDES=0;
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese el color:");
        var COLOR=leer.next();

        System.out.println("Ingrese el valor de la compra:");
        var VALCOMP=leer.nextFloat();

        if("BLANCO".equals(COLOR)){

            PDES=0;
        }

        else{
            if("VERDE".equals(COLOR)){

                PDES=10;
            }else{

                if("AMARILLO".equals(COLOR)){

                    PDES=25;

                }else{

                    if("AZUL".equals(COLOR)){

                        PDES=50;
                    }else{

                        PDES=100;
                    }

                }


            }

        }



        VALPAG=(VALCOMP)-((VALCOMP*PDES)/100);

        System.out.println("EL CLIENTE DEBE PAGAR:$"+VALPAG+" "+PDES);

    }

}
