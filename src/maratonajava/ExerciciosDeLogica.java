package maratonajava;

public class ExerciciosDeLogica {
    public static void main(String[] args) {

//        int num1 = 5;
//        int num2 = 6;
//        int num3 = 7;
//
//        System.out.println("numero 01:");
//        while (num1 >= 0){
//            System.out.println(num1);
//            num1--;
//        }
//            System.out.println("numero 02:");
//        while (num2 >= 0){
//            System.out.println(num2);
//            num2--;
//        }
//            System.out.println("Numero 03:");
//        while (num3 >= 0){
//            System.out.println(num3);
//            num3--;
//     }

         //   calcula o IMC de uma pessoa    \\

//         double peso = 59;
//         double altura = 1.53;
//
//         double calculoImc = peso / (altura * altura);
//
//       if ( calculoImc < 18.5) {
//            System.out.println("Abaico do peso");
//         } if ( calculoImc >= 18.6 && calculoImc <= 24.9) {
//             System.out.println("Peso ideal, Parabéns!");
//        } if (calculoImc >= 25.0 && calculoImc <= 29.0){
//            System.out.println("Leventemente acima do peso");
//        } if ( calculoImc >= 30.0 && calculoImc <= 34.9){
//            System.out.println("Obesidade Grau 1");
//        } if ( calculoImc >= 35.0 && calculoImc <= 39.9){
//            System.out.println("Obesidade Grau 2");
//        } if ( calculoImc >= 40){
//            System.out.println("Obesidade Grau 3");
//        }


//        String nomeAluno = "Jonas";
//        double nota1 = 8.4;
//        double nota2 = 6.5;
//        double nota3 = 7.75;
//        double nota4 = 8.5;
//
//        double media = nota1 + nota2 + nota3 + nota4 / 4;
//
//        if ( media >= 7){
//            System.out.println("Parabéns "+nomeAluno+", Você passou de ano!");
//        } else {
//            System.out.println("Que pena "+nomeAluno+" ,você reprovou");
//        }

        //   variavel preco do produto   \\

//        double valorProduto = 100.0;
//
//        double pix = 15 * valorProduto / 100;
//        double cartaoDebito = 10 * valorProduto / 100;
//        double cartaoDuasVzs = valorProduto;
//        double cartaoTresVzs = 10 * valorProduto / 100;
//
//        double variavelPreco1 = valorProduto - pix;
//        double variavelPreco2 = valorProduto - cartaoDebito;
//        double variavelPreco3 = valorProduto;
//        double variavelPreco4 = valorProduto + cartaoTresVzs;
//
//        System.out.println(variavelPreco4);


        //    verificação de idade    \\

//        String nome = "Mario";
//        int idade = 17;
//
//        if ( idade >= 18 ){
//            System.out.println(nome+", É maior de idade.");
//        } else {
//            System.out.println(nome+", É menor de idade.");
//        }


        //    idade tual de uma pessoa    \\

//        int anoNascimento = 2005;
//        int anoAtual = 2024;
//        int mesAtual = 4;
//        int diaAtual = 20;
//
//        int idadeAtual = anoAtual - anoNascimento;
//
//        System.out.println("Sua idade é: "+idadeAtual+" anos, "+mesAtual+" meses"+" "+diaAtual+" e dias.");


        // Escaleno tem todos os lados diferentes
        // Equilátero possui todos os lados iguais
        // Isósceles possui dois lados iguais


        //   verificação entre 3 triangulos \\

//         int valor1 = 20;
//         int valor2 = 30;
//         int valor3 = 10;
//
//         if ( valor1 == valor2 && valor1 == valor3) {
//             System.out.println("Equilatero: Possui todos os lados iguais");
//         } else if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3){
//             System.out.println("Escaleno: Possui todos os lados diferentes");
//        } else {
//             System.out.println("Isósceles: Possui dois lados iguais");
//         }


            //    conversão de temperatura    \\


//            double temperaturaFahrenheit = 78;
//
//            double conversaoParaCelsius = (5.0 * (temperaturaFahrenheit - 32) / 9);
//
//            System.out.println(conversaoParaCelsius);


             //    Tabuada do 1 ao 10     \\

//              int tabuada = 1;
//
//              if (tabuada < 11){
//                  for (int i=0; tabuada <= 10; i++){
//                      int result = tabuada * i;
//                      System.out.println(tabuada + " X " + i + " = " + result );
//                      tabuada++;
//                  }
//
//              }

                 int num = 2;

                 while ( num < 11){
                     for (int i=1; num <= 10; i++){
                         int result = num * i;

                         System.out.println(num + " X " + i + " = "+ result);

                     }
                 }





















    }
}
