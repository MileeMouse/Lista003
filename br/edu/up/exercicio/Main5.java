package br.edu.up.exercicio;
import br.edu.up.modelo.Compras;
import br.edu.up.modelo.Compras.Prestacoes;

import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double ValorCompra = teclado.nextDouble();

        Compras compra = new Compras (ValorCompra);
        double ValorPrestacao = Prestacoes.Prestacao(compra.getValorCompra()); 

        System.out.println("O valor de cada prestação é: R$" + ValorPrestacao);

        teclado.close();
    }
}


