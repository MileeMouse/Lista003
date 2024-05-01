package br.edu.up.modelo;

public class Estudante02 {
    private String Nome;
    private int Matricula;
    private double NotaLaboratorio;
    private double NotaAvaliacaoSemestral;
    private double NotaExameFinal;

    public Estudante02(String Nome, int Matricula, double NotaLaboratorio, double NotaAvaliacaoSemestral, double NotaExameFinal) {
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.NotaLaboratorio = NotaLaboratorio;
        this.NotaAvaliacaoSemestral = NotaAvaliacaoSemestral;
        this.NotaExameFinal = NotaExameFinal;
    }

    public String getNome() {
        return Nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public double getNotaLaboratorio() {
        return NotaLaboratorio;
    }

    public double getNotaAvaliacaoSemestral() {
        return NotaAvaliacaoSemestral;
    }

    public double getNotaExameFinal() {
        return NotaExameFinal;
    }

    public static double NotaFinal(Estudante02 estudante) {
        double notaLaboratorio = estudante.getNotaLaboratorio();
        double notaAvaliacaoSemestral = estudante.getNotaAvaliacaoSemestral();
        double notaExameFinal = estudante.getNotaExameFinal();
        
        return (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
}

    public static char calcularClassificacao(double notaFinal) {
    if (notaFinal >= 8.0) {
        return 'A';
    } else if (notaFinal >= 7.0) {
        return 'B';
    } else if (notaFinal >= 6.0) {
        return 'C';
    } else if (notaFinal >= 5.0) {
        return 'D';
    } else {
        return 'R';
    }
    }
}
