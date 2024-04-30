package br.edu.up.exercicio;

import br.edu.up.modelo.Aluno;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota da prova 1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da prova 2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da prova 3:");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média do aluno: " + aluno.calcularMedia());

        scanner.close();
    }
}