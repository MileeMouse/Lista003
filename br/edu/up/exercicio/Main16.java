package br.edu.up.exercicio;

import br.edu.up.modelo.Funcionario;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int TotalFuncionarios = 584;
        double TotalReajuste = 0;
        double TotalSalariosReajustados = 0;

        System.out.println("Informe o salário de cada funcionário:");

        for (int i = 1; i <= TotalFuncionarios; i++) {
            System.out.print("Salário do funcionário " + i + ": R$");
            double Salario = teclado.nextDouble();

            Funcionario funcionario = new Funcionario(Salario);
            double Reajuste = funcionario.CalcReajuste();
            double SalarioReajustado = funcionario.getSalarioReajustado();

            TotalReajuste += Reajuste;
            TotalSalariosReajustados += SalarioReajustado;

            System.out.println("Reajuste: R$" + Reajuste);
            System.out.println("Salário reajustado: R$" + SalarioReajustado);
        }

        System.out.println("Total de reajustes dados: R$" + TotalReajuste);
        System.out.println("Total de salários reajustados: R$" + TotalSalariosReajustados);

        teclado.close();
    }
}
