package br.edu.up.modelo;

public class Pessoa03 {
    private String Nome;
    private char Sexo;
    private int Idade;
    private boolean Saude;

    public Pessoa03(String Nome, char Sexo, int Idade, boolean Saude) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.Saude = Saude;
    }

    public boolean estaAptoServicoMilitar() {
        // Verifica se atende aos critérios para o serviço militar obrigatório
        return (Idade >= 18 && Idade <= 45 && Saude);
    }

    public char getSexo() {
        return Sexo;
    }
}
