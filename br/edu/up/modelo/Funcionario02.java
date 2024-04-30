package br.edu.up.modelo;

public class Funcionario02 {
    private String Nome;
    private int Idade;
    private char Sexo;
    private double SalarioFixo;

    public Funcionario02(String Nome, int Idade, char Sexo, double SalarioFixo) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.SalarioFixo = SalarioFixo;
    }

    public double CalcAbono() {
        double Abono = 0;
        if (Sexo == 'M') {
            if (Idade >= 30) {
                Abono = 100.00;
            } else {
                Abono = 50.00;
            }
        } else if (Sexo == 'F') {
            if (Idade >= 30) {
                Abono = 200.00;
            } else {
                Abono = 80.00;
            }
        }
        return Abono;
    }

    public double CalcSalarioLiquido() {
        return SalarioFixo + CalcAbono();
    }

    public String getNome() {
        return Nome;
    }

    public double getSalarioLiquido() {
        return CalcSalarioLiquido();
    }
}
