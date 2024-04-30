package br.edu.up.exercicio;

import br.edu.up.modelo.OitentaNumeros;
import br.edu.up.modelo.Intervalo;

public class Main9 {
    public static void main(String[] args) {
        int[] numeros = OitentaNumeros.lerNumeros();
        int numerosNoIntervalo = Intervalo.contarNumerosNoIntervalo(numeros);

        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + numerosNoIntervalo);
    }
}
