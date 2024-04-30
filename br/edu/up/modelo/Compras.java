package br.edu.up.modelo;

    public class Compras {
        private double ValorCompra;

        public Compras (double ValorCompra) {
            this.ValorCompra = ValorCompra;
        }

        public double getValorCompra() {
            return ValorCompra;
        }
    
        public class Prestacoes{
            public static int Prestacao = 5;

            public static double Prestacao (double ValorCompra){
                return ValorCompra / Prestacao;
            }
        }
}
