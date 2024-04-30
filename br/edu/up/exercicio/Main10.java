package br.edu.up.exercicio;

import br.edu.up.modelo.Pessoa;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja verificar a idade?");
        int QuantidadePessoas = teclado.nextInt();

        for (int i = 1; i <= QuantidadePessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = teclado.nextInt();

            Pessoa pessoa = new Pessoa(idade);
            System.out.println(pessoa.verificarIdade());
        }

        teclado.close();
    }
}
