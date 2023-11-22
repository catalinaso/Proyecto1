
public class Retiro extends Movimiento{

    private Cuenta Cuenta;

    public Retiro(){
        super();
    }
    
    public Retiro(String tipo, Cuenta cuenta, double monto){
        super(tipo, monto);
        this.Cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return this.Cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.Cuenta = cuenta;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println(
        "|\n|    Folio de la transaccion: #: " + super.getIdentificador() +
        "\n|    Operacion: Retiro" +
        "\n|    Fecha: " + this.getFecha().toString() +
        "\n|    Nombre: " + this.Cuenta.getCliente().getNombre() +
        "\n|    Direccion: " + this.Cuenta.getCliente().getDireccion() +
        "\n|    Cuenta: " + this.Cuenta.getNumeroDeCuenta());
        System.out.printf("|\n|    Monto: $ %-8.2f\n", super.getMonto());
        System.out.println();
    }
}