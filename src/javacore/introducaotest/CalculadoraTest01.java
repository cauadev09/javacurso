package javacore.introducaotest;

import javacore.introducaodominios.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro do CalculadoraTest01");
        System.out.println(a);
        System.out.println(b);
    }
}
