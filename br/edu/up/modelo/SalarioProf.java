package br.edu.up.modelo;

public class SalarioProf {
    public static double CalcSalario (Professor Professor, int HorasAula) {
        double ValorHoraAula = 0;
        
        switch (Professor.getNivel()) {
            case 1:
                ValorHoraAula = 12.00;
                break;
            case 2:
                ValorHoraAula = 17.00;
                break;
            case 3:
                ValorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível de professor inválido.");
        }
        
        return ValorHoraAula * HorasAula;
    }
}