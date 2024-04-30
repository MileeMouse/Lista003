package br.edu.up.modelo;

public class Vendedor {
    private String Nome;
    private double SalarioFixo;
    private double TotalVendas;

    public Vendedor(String Nome, double SalarioFixo, double TotalVendas) {
        this.Nome = Nome;
        this.SalarioFixo = SalarioFixo;
        this.TotalVendas = TotalVendas;
    }

    public String getNome() {
        return Nome;
    }

    public double getSalarioFixo() {
        return SalarioFixo;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }

    public double SalarioFinal() {
        double Comissao = TotalVendas * 0.15; 
        return SalarioFixo + Comissao;
    }
}