package br.edu.up.exercicio;

import br.edu.up.modelo.Professor;
import br.edu.up.modelo.SalarioProf;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do professor:");
        String Nome = teclado.nextLine();

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int Nivel = teclado.nextInt();

        System.out.println("Digite o número de horas/aula:");
        int HorasAula = teclado.nextInt();

        Professor professor = new Professor(Nome, Nivel);

        double Salario = SalarioProf.CalcSalario(professor, HorasAula);

        System.out.println("O salário de " + professor.getNome() + " é R$" + Salario);

        teclado.close();
    }
}
