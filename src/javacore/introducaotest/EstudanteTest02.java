package javacore.introducaotest;

import javacore.introducaodominios.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 14;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        estudante01.imprime();

        estudante02.imprime();





    }
}
