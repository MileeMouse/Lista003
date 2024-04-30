package br.edu.up.exercicio;

import br.edu.up.modelo.Automovel;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida (em km):");
        double DistanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros):");
        double CombustivelGasto = scanner.nextDouble();

        Automovel automovel = new Automovel(DistanciaPercorrida, CombustivelGasto);

        System.out.println("O consumo médio do automóvel é de: " + automovel.calcularConsumoMedio() + " km/l");

        scanner.close();
    }
}