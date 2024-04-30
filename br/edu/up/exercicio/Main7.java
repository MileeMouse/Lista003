package br.edu.up.exercicio;

import br.edu.up.modelo.Carro;
import br.edu.up.modelo.CustoConsumidor;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double CustoFabrica = scanner.nextDouble();

        Carro carro = new Carro(CustoFabrica);
        double custoConsumidor = CustoConsumidor.CalcCustoConsumidor(carro.getCustoFabrica());

        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);

        scanner.close();
    }
}
