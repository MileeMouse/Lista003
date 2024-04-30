package br.edu.up.modelo;

public class CustoConsumidor {
    private static final double Distribuidor = 0.28;
    private static final double Impostos = 0.45;

    public static double CalcCustoConsumidor(double CustoFabrica) {
        double CustoComImpostos = CustoFabrica * (1 + Impostos);
        double CustoComDistribuidor = CustoComImpostos * (1 + Distribuidor);
        return CustoComDistribuidor;
    }
}
