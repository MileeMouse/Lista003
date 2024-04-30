package br.edu.up.exercicio;

import br.edu.up.modelo.Funcionario02;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String Nome = teclado.nextLine();

        System.out.println("Informe a idade do funcionário:");
        int Idade = teclado.nextInt();

        System.out.println("Informe o sexo do funcionário (M/F):");
        char Sexo = teclado.next().charAt(0);

        System.out.println("Informe o salário fixo do funcionário:");
        double SalarioFixo = teclado.nextDouble();

        Funcionario02 funcionario = new Funcionario02(Nome, Idade, Sexo, SalarioFixo);
        double SalarioLiquido = funcionario.getSalarioLiquido();

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido: R$" + SalarioLiquido);

        teclado.close();
    }
}
