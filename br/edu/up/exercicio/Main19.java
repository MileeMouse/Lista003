package br.edu.up.exercicio;

import br.edu.up.modelo.Triangulo;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os três valores inteiros representando os lados do triângulo:");
        int Lado1 = teclado.nextInt();
        int Lado2 = teclado.nextInt();
        int Lado3 = teclado.nextInt();

        Triangulo triangulo = new Triangulo(Lado1, Lado2, Lado3);

        if (triangulo.FormaTriangulo()) {
            System.out.println("Os valores informados podem representar os lados de um triângulo.");
            System.out.println("Tipo de triângulo: " + triangulo.TipoTriangulo());
        } else {
            System.out.println("Os valores informados não podem representar os lados de um triângulo.");
        }

        teclado.close();
    }
}
