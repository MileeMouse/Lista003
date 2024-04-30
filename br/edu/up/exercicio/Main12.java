package br.edu.up.exercicio;

import br.edu.up.modelo.CarangoVelho;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int TotalCarrosAte2000 = 0;
        int TotalGeral = 0;

        char Continuar;
        do {
            System.out.println("Informe o ano do carro:");
            int Ano = teclado.nextInt();

            CarangoVelho carro = new CarangoVelho(Ano);
            double Desconto = carro.calcularDesconto();
            double ValorDesconto = Desconto * 100;
            System.out.println("O desconto para este carro é de: " + ValorDesconto + "%");

            TotalGeral++;
            if (Ano <= 2000) {
                TotalCarrosAte2000++;
            }

            System.out.println("Deseja continuar calculando desconto? (S/N)");
            Continuar = teclado.next().charAt(0);
        } while (Continuar != 'N' && Continuar != 'n');

        System.out.println("Total de carros até 2000: " + TotalCarrosAte2000);
        System.out.println("Total geral de carros: " + TotalGeral);

        teclado.close();
    }
}
