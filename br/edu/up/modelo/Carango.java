package br.edu.up.modelo;

public class Carango {
    private String Combustivel;
    private double Valor;

    public Carango(String Combustivel, double Valor) {
        this.Combustivel = Combustivel;
        this.Valor = Valor;
    }

    public double CalcDesconto() {
        switch (Combustivel) {
            case "Álcool":
                return Valor * 0.25; 
            case "Gasolina":
                return Valor * 0.21;
            case "Diesel":
                return Valor * 0.14; 
            default:
                return 0; 
        }
    }

    public double CalcularValorFinal() {
        return Valor - CalcDesconto();
    }
}
