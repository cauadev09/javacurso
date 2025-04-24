package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Personagem;

public class PersonagemTest01 {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        personagem.nome = "Homem Aranha";
        personagem.forca = 3000;
        personagem.nivel = 100;
        personagem.dano = 50;

//        System.out.format("Personagem: %s (lvl %d) com %d de força.", personagem.nome, personagem.forca, personagem.nivel);System.out.format("Personagem: %s (lvl %d) com %d de força.", personagem.nome, personagem.forca, personagem.nivel);

      //  personagem.mostrarStatus();

        //  chamei um metodo atacar e passei como argumento uma string "Homem Lama"
        personagem.atacar("Homem lama", "Golpe duplo");


    }

}
