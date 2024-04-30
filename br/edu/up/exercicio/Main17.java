package br.edu.up.exercicio;

import br.edu.up.modelo.Funcionario01;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String Nome = teclado.nextLine();

        System.out.println("Informe o salário do funcionário:");
        double Salario = teclado.nextDouble();

        System.out.println("Informe o valor do salário mínimo:");
        double SalarioMin = teclado.nextDouble();

        Funcionario01 funcionario = new Funcionario01(Nome, Salario, SalarioMin);
        double NovoSalario = funcionario.CalcReajuste();
        double AumentoFolha = funcionario.calcularAumentoFolha();

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Novo salário reajustado: R$" + NovoSalario);
        System.out.println("Aumento na folha de pagamento: R$" + AumentoFolha);

        teclado.close();
    }
}
