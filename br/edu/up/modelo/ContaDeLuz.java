package br.edu.up.modelo;

public class ContaDeLuz {
    private int TipoCliente;
    private double ConsumoKWh;

    public ContaDeLuz(int TipoCliente, double ConsumoKWh) {
        this.TipoCliente = TipoCliente;
        this.ConsumoKWh = ConsumoKWh;
    }

    public int getTipoCliente() {
        return TipoCliente;
    }

    public double getConsumoKWh() {
        return ConsumoKWh;
    }

    public static double CalcValorConta(ContaDeLuz conta) {
        int TipoCliente = conta.getTipoCliente();
        double ConsumoKWh = conta.getConsumoKWh();
        double ValorKW = 0;

        switch (TipoCliente) {
            case 1:
                ValorKW = 0.60;
                break;
            case 2:
                ValorKW = 0.48;
                break;
            case 3:
                ValorKW = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
        }

        return ValorKW * ConsumoKWh;
    }
}

