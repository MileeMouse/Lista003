package br.edu.up.exercicio;

import br.edu.up.modelo.Pessoa03;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int TotalAptos = 0;
        int TotalInaptos = 0;

        System.out.println("Quantas pessoas deseja verificar?");
        int QuantidadePessoas = teclado.nextInt();

        for (int i = 1; i <= QuantidadePessoas; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            System.out.print("Nome: ");
            String Nome = teclado.next();

            System.out.print("Sexo (M/F): ");
            char Sexo = teclado.next().toUpperCase().charAt(0);

            System.out.print("Idade: ");
            int Idade = teclado.nextInt();

            System.out.print("Possui boa saúde? (S/N): ");
            boolean Saude = teclado.nextBoolean();

            Pessoa03 pessoa = new Pessoa03(Nome, Sexo, Idade, Saude);
            if (pessoa.estaAptoServicoMilitar()) {
                System.out.println("Está apto para o serviço militar obrigatório.");
                TotalAptos++;
            } else {
                System.out.println("Não está apto para o serviço militar obrigatório.");
                TotalInaptos++;
            }
        }

        System.out.println("Total de pessoas aptas: " + TotalAptos);
        System.out.println("Total de pessoas inaptas: " + TotalInaptos);

        teclado.close();
    }
}
