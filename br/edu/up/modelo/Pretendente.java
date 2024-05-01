package br.edu.up.modelo;

public class Pretendente {
    private String nome;
    private int idade;
    private String grupoRisco;

    public Pretendente(String nome, int idade, String grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGrupoRisco() {
        return grupoRisco;
    }
}
