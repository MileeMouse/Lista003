package br.edu.up.exercicio;

import br.edu.up.modelo.Aluno01;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = notas.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = notas.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = notas.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = notas.nextDouble();

        Aluno01 aluno01 = new Aluno01(nome, nota1, nota2, nota3);
        double media = aluno01.calcularMedia();

        System.out.println("Nome do aluno: " + aluno01.getNome());
        System.out.println("Média do aluno: " + media);

        if (media >= 7) {
            System.out.println("Menção: Aprovado");
        } else if (media <= 5) {
            System.out.println("Menção: Reprovado");
        } else {
            System.out.println("Menção: Recuperação");
        }

        notas.close();
    }
}
