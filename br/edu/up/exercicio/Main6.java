package br.edu.up.exercicio;

import br.edu.up.modelo.Produto;
import br.edu.up.modelo.PrecoVenda;
import java.util.Scanner;

public class Main6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double PrecoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de acréscimo (em %):");
        double Aumento = scanner.nextDouble();

        Produto produto = new Produto(PrecoCusto);
        double precoVenda = PrecoVenda.CalcPrecoVenda(produto.getPrecoCusto(), Aumento);

        System.out.println("O preço de venda do produto é: R$" + precoVenda);

        scanner.close();
    }
}
