package br.edu.up.exercicio;
import br.edu.up.modelo.Moeda;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar:");
        double CotacaoDolar = teclado.nextDouble();

        System.out.println("Digite a quantidade de dólares:");
        double QuantidadeDolares = teclado.nextDouble();

        Moeda conversor = new Moeda (CotacaoDolar);
        double ValorEmReais = conversor.Conversao(QuantidadeDolares);

        System.out.println("O valor em reais é: R$" + ValorEmReais);

        teclado.close();
    }
}
