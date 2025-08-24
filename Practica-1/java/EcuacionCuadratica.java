package com.mycompany.programacion_2;
import java.util.Scanner;

//algebra : ecuacion cuadratico
//ej. de entrada--> a,b,c: 1,0 3 1 --> para los numeros que tienen decimales no ingresarlos con "." sino con "," 
//@autor Natalia Ruby
//@version 1.0 20/08/2025

class EcuacionCuadratica {
    private final double a;
    private final double b;
    private final double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        double disc = getDiscriminante();
        if (disc < 0) {
            throw new ArithmeticException("No hay raíces reales");
        }
        return (-b + Math.sqrt(disc)) / (2 * a);
    }

    public double getRaiz2() {
        double disc = getDiscriminante();
        if (disc < 0) {
            throw new ArithmeticException("No hay raíces reales");
        }
        return (-b - Math.sqrt(disc)) / (2 * a);
    }
}

//(TEST)algebra : ecuacion cuadratica
//ej. de entrada--> a,b,c: 1,0 3 1 --> para los numeros que tienen decimales no ingresarlos con "." sino con "," 
//@autor Natalia Ruby
//@version 1.0 20/08/2025

public class testcuadratica {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Ingrese a, b y c:");
        double a = Scanner.nextDouble();
        double b = Scanner.nextDouble();
        double c = Scanner.nextDouble();

        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);

        double disc = eq.getDiscriminante();
        if (disc < 0) {
            System.out.println("La ecuacion no tiene raices reales.");
        } else {
            System.out.println("Raiz 1 = " + eq.getRaiz1());
            System.out.println("Raiz 2 = " + eq.getRaiz2());
        }
    }
}


