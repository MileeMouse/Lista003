package br.edu.up.exercicio;

import br.edu.up.modelo.Estudante;
import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = teclado.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = teclado.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = teclado.nextDouble();

        Estudante estudante = new Estudante(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);

        double notaFinal = Estudante.calcularNotaFinal(estudante);

        System.out.println("A nota final do estudante é: " + notaFinal);

        teclado.close();
    }
}
