package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Kakashi";
        professor.idade = 44;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);


    }
}
