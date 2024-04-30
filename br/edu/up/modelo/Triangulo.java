package br.edu.up.modelo;

public class Triangulo {
    private int Lado1;
    private int Lado2;
    private int Lado3;

    public Triangulo(int Lado1, int Lado2, int Lado3) {
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
    }

    public String TipoTriangulo() {
        if (Lado1 == Lado2 && Lado2 == Lado3) {
            return "Equilátero";
        } else if (Lado1 == Lado2 || Lado1 == Lado3 || Lado2 == Lado3) {
            return "Isóscele";
        } else {
            return "Escaleno";
        }
    }

    public boolean FormaTriangulo() {
        return (Lado1 + Lado2 > Lado3) && (Lado1 + Lado3 > Lado2) && (Lado2 + Lado3 > Lado1);
    }
}
