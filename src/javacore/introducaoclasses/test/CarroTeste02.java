package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;

public class CarroTeste02 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Fiat Uno";
        carro.modelo = "Uno";
        carro.numPassageiros = 4;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

//        System.out.println(carro.nome);
//        System.out.println(carro.modelo);
//
//        carro.exibirAutonomia();

        double autonomia = carro.obterAutonomia();
        System.out.println(autonomia);
    }
}
