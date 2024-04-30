package br.edu.up.modelo;

public class PrecoVenda {
    public static double PrecoVenda;

    public static double CalcPrecoVenda(double PrecoCusto, double Aumento) {
        return PrecoCusto * (1 + Aumento / 100);
    }
}
