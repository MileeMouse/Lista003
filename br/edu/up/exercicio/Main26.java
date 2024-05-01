package br.edu.up.exercicio;

import br.edu.up.modelo.Pretendente;
import br.edu.up.modelo.ClassificacaoSeguro;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("A idade do pretendente não está na faixa necessária.");
        }

        System.out.println("Digite o grupo de risco do pretendente (Baixo, Médio ou Alto):");
        String grupoRisco = scanner.next();

        Pretendente pretendente = new Pretendente(nome, idade, grupoRisco);

        String categoria = ClassificacaoSeguro.determinarCategoria(pretendente);

        System.out.println("Nome: " + pretendente.getNome());
        System.out.println("Idade: " + pretendente.getIdade());
        System.out.println("Grupo de Risco: " + pretendente.getGrupoRisco());
        System.out.println("Categoria de Seguro: " + categoria);

        scanner.close();
    }
}
