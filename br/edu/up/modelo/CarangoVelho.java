package br.edu.up.modelo;

public class CarangoVelho {
    private int Ano;

    public CarangoVelho(int Ano) {
        this.Ano = Ano;
    }

    public int getAno() {
        return Ano;
    }

    public double calcularDesconto() {
        if (Ano <= 2000) {
            return 0.12; // 12% de desconto
        } else {
            return 0.07; // 7% de desconto
        }
    }
}
