package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Celular;

public class CelularTest01 {
    public static void main(String[] args) {
        Celular celular1 = new Celular();

        celular1.marca = "Motorola";
        celular1.sistemaOperacional = "Android";
        celular1.tamArmazenamento = 256;
        celular1.tamTela = 6.5f;

        System.out.println("A marca é: " + celular1.marca + ", O SO é: " + celular1.sistemaOperacional + ", O tamanho do Armazenamneto é: " + celular1.tamArmazenamento+"gb");

    }
}
