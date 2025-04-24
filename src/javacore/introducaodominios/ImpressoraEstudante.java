package javacore.introducaodominios;

public class ImpressoraEstudante {
        public void imprime(Estudante estudante) {

            System.out.println("-----------------");

            estudante.nome = "Goku"; //--> Altera o nome em todos os objetos

            System.out.println(estudante.nome);
            System.out.println(estudante.sexo);
            System.out.println(estudante.idade);

        }
}
