package br.edu.up.modelo;

public class Professor {
    private String Nome;
    private int Nivel;

    public Professor(String Nome, int Nivel) {
        this.Nome = Nome;
        this.Nivel = Nivel;
    }

    public String getNome() {
        return Nome;
    }

    public int getNivel() {
        return Nivel;
    }
}
