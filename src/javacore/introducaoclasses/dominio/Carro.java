package javacore.introducaoclasses.dominio;

public class Carro {

    public String nome; // atributos são as características
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia é " + capCombustivel  * consumoCombustivel  + "km");
    }

    public double obterAutonomia(){

        System.out.println("Metodo obter autonomia: ");
        return capCombustivel * consumoCombustivel;
    }


}
