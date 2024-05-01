package br.edu.up.modelo;

public class Estudante {
    
    private double NotaLaboratorio;
    private double NotaAvaliacaoSemestral;
    private double NotaExameFinal;

    public Estudante(double NotaLaboratorio, double NotaAvaliacaoSemestral, double NotaExameFinal) {
        this.NotaLaboratorio = NotaLaboratorio;
        this.NotaAvaliacaoSemestral = NotaAvaliacaoSemestral;
        this.NotaExameFinal = NotaExameFinal;
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

    public static double calcularNotaFinal(Estudante estudante) {
        double NotaLaboratorio = estudante.getNotaLaboratorio();
        double NotaAvaliacaoSemestral = estudante.getNotaAvaliacaoSemestral();
        double NotaExameFinal = estudante.getNotaExameFinal();
 
        double NotaFinal = (NotaLaboratorio * 2 + NotaAvaliacaoSemestral * 3 + NotaExameFinal * 5) / 10;

        return NotaFinal;
    }
}
