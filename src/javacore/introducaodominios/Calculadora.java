package javacore.introducaodominios;

public class Calculadora {

    public void someDoisNumeros() {
        System.out.println(10 + 10);

    }

    public void subtracao(){
        System.out.println(20 - 4);

    }

    public void multiplicacao(int num1, int num2){ // o valor entre parênteses é chamado de parânmetro
        System.out.println(num1 * num2);

    }

    public void divisao(double num1, double num2){

      if(num2 == 0){
          System.out.println("nao existe divisao por zero");
          return;

      } System.out.println(num1 / num2);


    }

    public void alteraDoisNumeros(int num1, int num2){

        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);

    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
