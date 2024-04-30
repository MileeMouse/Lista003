package br.edu.up.exercicio;

import br.edu.up.modelo.Carango;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double TotalDesconto = 0;
        double TotalPago = 0;

        System.out.println("Informe os dados dos veículos:");
        while (true) {
            System.out.print("Combustível (Álcool/Gasolina/Diesel): ");
            String Combustivel = teclado.next();

            if (Combustivel.equals("Zero")) {
                break;
            }

            System.out.print("Valor do veículo: ");
            double Valor = teclado.nextDouble();

            Carango veiculo = new Carango(Combustivel, Valor);
            double Desconto = veiculo.CalcDesconto();
            double ValorFinal = veiculo.CalcularValorFinal();
            TotalDesconto += Desconto;
            TotalPago += ValorFinal;

            System.out.println("Desconto: " + Desconto);
            System.out.println("Valor a ser pago: " + ValorFinal);
        }

        System.out.println("Total de desconto: " + TotalDesconto);
        System.out.println("Total pago pelos clientes: " + TotalPago);

        teclado.close();
    }
}
