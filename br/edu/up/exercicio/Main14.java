package br.edu.up.exercicio;

import br.edu.up.modelo.Produto01;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double SomaPrecoCusto = 0;
        double SomaPrecoVenda = 0;

        System.out.println("Informe o preço de custo e o preço de venda de 40 produtos:");

        for (int i = 1; i <= 40; i++) {
            System.out.println("Produto " + i + ":");
            System.out.print("Preço de custo: ");
            double PrecoCusto = teclado.nextDouble();

            System.out.print("Preço de venda: ");
            double PrecoVenda = teclado.nextDouble();

            Produto01 produto = new Produto01(PrecoCusto, PrecoVenda);
            String Resultado = produto.CalcResultado();
            System.out.println("Resultado: " + Resultado);

            SomaPrecoCusto += PrecoCusto;
            SomaPrecoVenda += PrecoVenda;
        }

        double MediaPrecoCusto = SomaPrecoCusto / 40;
        double MediaPrecoVenda = SomaPrecoVenda / 40;

        System.out.println("Média de preço de custo: " + MediaPrecoCusto);
        System.out.println("Média de preço de venda: " + MediaPrecoVenda);

        teclado.close();
    }
}
