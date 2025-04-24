package maratonajava;

public class Aula02 {

    public static void main(String[] args) {

            int idadeJogador = 18;

            if(idadeJogador < 15){
                System.out.println("categoria infantil");

            } else if (idadeJogador >= 15 && idadeJogador < 18) {
                System.out.println("categoria juvenil");

            } else {
              //  System.out.println("categoria adulto");
            }

//        int numA  = 10;
//        int numB = 20;
//        int numC;
//
//        if ( numA == numB) {
//            numC = numA+numB;
//        } else {
//            numC = numA * numB;
//        }
//        System.out.println("C é igual a: "+ numC);


        int numero = 0;
//            boolean comparacao = numero > 0;
//            boolean comparacao2 = numero < 0;
//            if (numero > 0){
//                System.out.println("É positivo: "+numero);
//            } else {
//                System.out.println("É negativo "+numero);
//            }
            if (numero == 0){
                System.out.println("O numero zero é neutro: "+numero);
                return;
            }
            if (numero % 2 == 0){
                System.out.println("O numero é par: "+numero);
            } else {
                System.out.println("O numero é impar: "+numero);
            }

            if (numero > 0){
            System.out.println("O número é positivo: "+numero);

        } else if (numero < 0){
            System.out.println("O número é negativo: "+numero);
        }







        }
    }

