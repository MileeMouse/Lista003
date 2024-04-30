package br.edu.up.exercicio;

import br.edu.up.modelo.Pessoa01;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;

        System.out.println("Informe o nome e o sexo de 56 pessoas:");
        for (int i = 1; i <= 56; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Nome: ");
            String nome = teclado.next();

            System.out.print("Sexo (M/F): ");
            char sexo = teclado.next().toUpperCase().charAt(0);

            Pessoa01 pessoa = new Pessoa01(nome, sexo);
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo());

            if (sexo == 'M') {
                totalHomens++;
            } else if (sexo == 'F') {
                totalMulheres++;
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        teclado.close();
    }
}
