package br.edu.up.exercicio;

import br.edu.up.modelo.Pessoa04;
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String Nome = teclado.nextLine();

        System.out.println("Digite o sexo da pessoa (M ou F):");
        char Sexo = teclado.next().charAt(0);

        System.out.println("Digite a altura da pessoa (em metros):");
        double Altura = teclado.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int Idade = teclado.nextInt();

        Pessoa04 pessoa = new Pessoa04(Nome, Sexo, Altura, Idade);

        double PesoIdeal = Pessoa04.CalcPesoIdeal(pessoa);

        System.out.println("O peso ideal de " + pessoa.getNome() + " é: " + PesoIdeal + " kg");

        teclado.close();
    }
}
