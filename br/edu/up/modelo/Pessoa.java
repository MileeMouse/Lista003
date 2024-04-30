package br.edu.up.modelo;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String verificarIdade() {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
