public class Transferencia extends Movimiento{

    private Cuenta CuentaOrigen;
    private Cuenta CuentaDestino;

    public Transferencia(){
        super();
    }

    public Transferencia(String tipo, Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto){
        super(tipo, monto);
        this.CuentaOrigen = cuentaOrigen;
        this.CuentaDestino = cuentaDestino;
    }

    public Cuenta getCuentaOrigen() {
        return this.CuentaOrigen;
    }
    public void setCuentaOrigen(Cuenta cuentaOrigen) {
        this.CuentaOrigen = cuentaOrigen;
    }
    public Cuenta getCuentaDestino() {
        return this.CuentaDestino;
    }
    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.CuentaDestino = cuentaDestino;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println(
        "|\n|    Folio de la transaccion: #: " + super.getIdentificador() +
        "\n|    Operacion: Transferencia" +
        "\n|    Fecha: " + this.getFecha().toString() +
        "\n|    Nombre: " + this.CuentaOrigen.getCliente().getNombre() +
        "\n|    Direccion: " + this.CuentaOrigen.getCliente().getDireccion() +
        "\n|    Cuenta de origen: " + this.CuentaOrigen.getNumeroDeCuenta() +
        "\n|    Cuenta de destino: " + this.CuentaDestino.getNumeroDeCuenta());
        System.out.printf("|    Monto: $ %-8.2f\n|", super.getMonto());
        System.out.println();
    }
    
}