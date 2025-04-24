package javacore.introducaotest;

import javacore.introducaodominios.Estudante;
import javacore.introducaodominios.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 14;
        estudante01.sexo = 'M';

        estudante02.nome = "Sasuki";
        estudante02.idade = 14;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
