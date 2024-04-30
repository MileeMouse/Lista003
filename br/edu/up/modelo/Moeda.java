package br.edu.up.modelo;

public class Moeda {
    private double CotacaoDolar;

    public Moeda(double CotacaoDolar) {
        this.CotacaoDolar = CotacaoDolar;
    }

    public double Conversao (double ValorEmDolar) {
        return ValorEmDolar * CotacaoDolar;
    }
}


