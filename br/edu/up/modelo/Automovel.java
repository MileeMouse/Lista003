package br.edu.up.modelo;

public class Automovel {
    private double DistanciaPercorrida;
    private double CombustivelGasto;

    public Automovel(double DistanciaPercorrida, double CombustivelGasto) {
        this.DistanciaPercorrida = DistanciaPercorrida;
        this.CombustivelGasto = CombustivelGasto;
    }

    public double calcularConsumoMedio() {
        return DistanciaPercorrida / CombustivelGasto;
    }
}
