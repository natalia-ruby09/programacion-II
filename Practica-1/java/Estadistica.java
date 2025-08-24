package com.mycompany.programacion_2;
import java.util.Scanner;

//estadistica: calcular el promedio y la desviacion estandar.
//@autor Natalia Ruby
//@version 1.0 22/08/2025

class estadistica {
    private final double[] datos;

    public estadistica(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double num : datos) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
}

//(TEST)estadistica: calcular el promedio y la desviacion estandar.
//@autor Natalia Ruby
//@version 1.0 22/08/2025

public class testestadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        String[] valoresStr = sc.nextLine().split(" ");
        double[] valores = new double[valoresStr.length];

        for (int i = 0; i < valoresStr.length; i++) {
            valores[i] = Double.parseDouble(valoresStr[i]);
        }

        estadistica est = new estadistica(valores);

        System.out.printf("El promedio es %.2f%n", est.promedio());
        System.out.printf("La desviación estandar es %.5f%n", est.desviacion());
    }
}
