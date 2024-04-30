package br.edu.up.modelo;

public class Pessoa01 {
    private String Nome;
    private char Sexo; // 'M' para masculino, 'F' para feminino

    public Pessoa01(String nome, char sexo) {
        this.Nome = nome;
        this.Sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public String getSexo() {
        if (Sexo == 'M') {
            return "Homem";
        } else {
            return "Mulher";
        }
    }
}
