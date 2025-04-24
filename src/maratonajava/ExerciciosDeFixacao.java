package maratonajava;

public class ExerciciosDeFixacao {
    public static void main(String[] args) {
        int nota = 7;
        aumentarNota(nota);
        System.out.println("Fora do metodo: "+nota);

    }

    public static void aumentarNota(int nota){

          nota = nota + 3;
          System.out.println("Dentro do metodo: "+nota);
    }
}



