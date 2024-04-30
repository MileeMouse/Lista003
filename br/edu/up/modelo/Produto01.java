package br.edu.up.modelo;

public class Produto01 {
    private double PrecoCusto;
    private double PrecoVenda;

    public Produto01(double PrecoCusto, double PrecoVenda) {
        this.PrecoCusto = PrecoCusto;
        this.PrecoVenda = PrecoVenda;
    }

    public String CalcResultado() {
        if (PrecoVenda > PrecoCusto) {
            return "Lucro";
        } else if (PrecoVenda < PrecoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }
}