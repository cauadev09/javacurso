package javacore.introducaodominios;

public class ImpressoraFuncionario {
    public void dadosFuncionario(Funcionario funcionario){

        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);

        System.out.print("Salários: "+funcionario.salario01+ " ");
        System.out.print(funcionario.salario02+ " ");
        System.out.print(funcionario.salario03+" ");
    }

    public void mediaSalario(Funcionario funcionario){
        double mediaSalario = funcionario.salario01 + funcionario.salario02 + funcionario.salario03 / 3;
        System.out.println("\n" + "A Média salarial é: "+ mediaSalario);
    }



}
