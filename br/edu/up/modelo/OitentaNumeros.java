package br.edu.up.modelo;

import java.util.Scanner;

public class OitentaNumeros {
    private static final int num_num = 80;

    public static int[] lerNumeros() {
        int[] numeros = new int[num_num];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os 80 números:");

        for (int i = 0; i < num_num; i++) {
            numeros[i] = teclado.nextInt();
        }

        teclado.close();
        return numeros;
    }
}
