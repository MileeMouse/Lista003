package br.edu.up.modelo;

public class Intervalo {
    private static final int Minimo = 10;
    private static final int Maximo = 150;

    public static int contarNumerosNoIntervalo(int[] numeros) {
        int contador = 0;

        for (int numero : numeros) {
            if (numero >= Minimo && numero <= Maximo) {
                contador++;
            }
        }

        return contador;
    }
}
