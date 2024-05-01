package br.edu.up.exercicio;

import br.edu.up.modelo.Nadador;
import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int Idade = teclado.nextInt();

        Nadador nadador = new Nadador(Idade);

        String Categoria = ClassificarNadador(nadador);

        System.out.println("O nadador está na categoria: " + Categoria);

        teclado.close();
    }

    private static String ClassificarNadador(Nadador Nadador) {
        int Idade = Nadador.getIdade();

        if (Idade >= 5 && Idade <= 7) {
            return "Infantil A";
        } else if (Idade >= 8 && Idade <= 10) {
            return "Infantil B";
        } else if (Idade >= 11 && Idade <= 13) {
            return "Juvenil A";
        } else if (Idade >= 14 && Idade <= 17) {
            return "Juvenil B";
        } else if (Idade >= 18 && Idade <= 25) {
            return "Sênior";
        } else {
            return "Idade fora da faixa etária";
        }
    }
}
