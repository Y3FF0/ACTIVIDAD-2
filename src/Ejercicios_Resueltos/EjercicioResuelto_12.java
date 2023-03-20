package Ejercicios_Resueltos;

import java.util.Scanner;

public class EjercicioResuelto_12 {
    public static void main(String[] args) {
        int Salario;
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador:");
        String NOM=leer.nextLine();

        System.out.println("Ingrese las horas trabajadas:");
        int NHT=leer.nextInt();

        System.out.println("Ingrese las horas trabajadas:");
        int VHN=leer.nextInt();

        if (NHT>40){
            int HET=NHT-40;
            if(HET>8){
                int HEE8 = HET-8;
                Salario= (40*VHN)+(16*VHN)+(HEE8*3*VHN);
            }
            else{
                Salario= (40 * VHN) + (HET * 2 * VHN);


            }

        }
        else{
            Salario= NHT * VHN;
        }

        System.out.println("EL TRABAJADOR, "+NOM+ " DEVENGO: $"+Salario);

    }


}
