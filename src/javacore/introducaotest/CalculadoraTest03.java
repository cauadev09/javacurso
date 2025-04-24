package javacore.introducaotest;

import javacore.introducaodominios.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {5, 10, 20, 30, 10};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(5, 10, 20, 30, 10);
    }
}
