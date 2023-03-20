package Ejercicio_Diagrama_UML;

public class PruebaFiguras {

    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        System.out.println("El area del circulo es = " + figura1.
                calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.
                calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.
                calcularArea());
        System.out.println("El perimetro del rectángulo es = " + figura2.
                calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.
                calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
                calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.
                calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
                calcularPerimetro());
        figura4.determinarTipoTriángulo();
    }

}
