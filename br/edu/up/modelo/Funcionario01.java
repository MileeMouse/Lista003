package br.edu.up.modelo;

public class Funcionario01 {
    private String Nome;
    private double Salario;
    private double SalarioMin;

    public Funcionario01(String Nome, double Salario, double SalarioMin) {
        this.Nome = Nome;
        this.Salario = Salario;
        this.SalarioMin = SalarioMin;
    }

    public double CalcReajuste() {
        double NovoSalario = Salario + (Salario * 0.1); 
        return NovoSalario;
    }

    public double calcularAumentoFolha() {
        return CalcReajuste() - Salario;
    }

    public String getNome() {
        return Nome;
    }

    public double getSalario() {
        return Salario;
    }
}
