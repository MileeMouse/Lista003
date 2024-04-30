package br.edu.up.modelo;

public class Funcionario {
    private double Salario;
    private static final double SalarioMin = 1100; 

    public Funcionario(double Salario) {
        this.Salario = Salario;
    }

    public double CalcReajuste() {
        if (Salario < 3 * SalarioMin) {
            return Salario * 0.5; 
        } else if (Salario >= 3 * SalarioMin && Salario <= 10 * SalarioMin) {
            return Salario * 0.2; 
        } else if (Salario > 10 * SalarioMin && Salario <= 20 * SalarioMin) {
            return Salario * 0.15; 
        } else {
            return Salario * 0.1; 
        }
    }

    public double getSalario() {
        return Salario;
    }

    public double getSalarioReajustado() {
        return Salario + CalcReajuste();
    }
}
