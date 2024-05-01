package br.edu.up.exercicio;

import br.edu.up.modelo.Estudante02;
import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = teclado.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int matricula = teclado.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = teclado.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = teclado.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = teclado.nextDouble();

        Estudante02 estudante = new Estudante02(nome, matricula, notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);

        double notaFinal = Estudante02.CalcNota(estudante);
        char classificacao = Estudante02.calcularClassificacao(notaFinal);

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        teclado.close();
    }
}
