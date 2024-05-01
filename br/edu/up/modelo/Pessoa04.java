package br.edu.up.modelo;

public class Pessoa04 {
    private String Nome;
    private char Sexo;
    private double Altura;
    private int Idade;

    public Pessoa04(String Nome, char Sexo, double Altura, int Idade) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Altura = Altura;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public double getAltura() {
        return Altura;
    }

    public int getIdade() {
        return Idade;
    }

    public static double CalcPesoIdeal(Pessoa04 pessoa) {
    char sexo = pessoa.getSexo();
    double altura = pessoa.getAltura();
    int idade = pessoa.getIdade();
    double pesoIdeal = 0;

    if (sexo == 'M') {
        if (altura > 1.70) {
            if (idade <= 20)
                pesoIdeal = (72.7 * altura) - 58;
            else if (idade >= 21 && idade <= 39)
                pesoIdeal = (72.7 * altura) - 53;
            else
                pesoIdeal = (72.7 * altura) - 45;
        } else {
            if (idade <= 40)
                pesoIdeal = (72.7 * altura) - 50;
            else
                pesoIdeal = (72.7 * altura) - 58;
        }
    } else if (sexo == 'F') {
        if (altura > 1.50) {
            if (idade >= 35)
                pesoIdeal = (62.1 * altura) - 45;
            else
                pesoIdeal = (62.1 * altura) - 49;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
    }

    return pesoIdeal;
}
}