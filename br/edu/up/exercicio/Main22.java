package br.edu.up.exercicio;

import br.edu.up.modelo.ContaDeLuz;
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria):");
        int TipoCliente = teclado.nextInt();

        System.out.println("Digite o consumo de kWh:");
        double ConsumoKWh = teclado.nextDouble();

        ContaDeLuz conta = new ContaDeLuz(TipoCliente, ConsumoKWh);

        double valorConta = ContaDeLuz.CalcValorConta(conta);

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        teclado.close();
    }
}

