package com.mycompany.programacion_2;
import java.util.Scanner;

//algebra : ecuacion lineal 2x2.
//@autor Natalia Ruby
//@version 1.0 20/08/2025

class Ecuacionlineal {

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;

    public Ecuacionlineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

//(TEST)algebra : ecuacion lineal 2x2.
//@autor Natalia Ruby
//@version 1.0 20/08/2025

public class testEcuacionLineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese a, b, c, d, e, f : ");
        String[] valores = scanner.nextLine().split(" ");

        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);
        double d = Double.parseDouble(valores[3]);
        double e = Double.parseDouble(valores[4]);
        double f = Double.parseDouble(valores[5]);

        Ecuacionlineal eq = new Ecuacionlineal(a, b, c, d, e, f);
        if (eq.tieneSolucion()) {
            System.out.println("x= " + eq.getX() + ", y= " + eq.getY());}
        else {
            System.out.println("La ecuacion no tiene solucion");}
    }
}
