package br.edu.up.exercicio;

import br.edu.up.modelo.Vendedor;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Digite o nome do vendedor: ");
        String Nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double SalarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas (em dinheiro): ");
        double TotalVendas = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(Nome, SalarioFixo, TotalVendas);
        
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo: R$" + vendedor.getSalarioFixo());
        System.out.println("Salário final do mês: R$" + vendedor.SalarioFinal());

        scanner.close();
    }
}