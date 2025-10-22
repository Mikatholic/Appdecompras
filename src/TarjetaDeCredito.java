public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompra;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }
}
