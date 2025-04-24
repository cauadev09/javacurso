package javacore.introducaotest;

import javacore.introducaodominios.Funcionario;
import javacore.introducaodominios.ImpressoraFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        ImpressoraFuncionario impressora = new ImpressoraFuncionario();

        funcionario01.nome = "Rick";
        funcionario01.idade = 50;

        funcionario01.salario01 = 5000;
        funcionario01.salario02 = 5000;
        funcionario01.salario03 = 5000;

      impressora.dadosFuncionario(funcionario01);
      impressora.mediaSalario(funcionario01);

    }
}
