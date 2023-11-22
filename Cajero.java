import java.util.ArrayList;

public class Cajero implements Transferencias {
    private String localizacion;
    private Banco banco;
    ArrayList<Movimiento> movimientos;

    public Cajero(String localizacion, Banco banco) {
        this.localizacion = localizacion;
        this.banco = banco;
        this.movimientos = new ArrayList<Movimiento>();
    }

    public String getLocalizacion() { return this.localizacion; }
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }

    public Banco getBanco() { return this.banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    public ArrayList<Movimiento> getMovimientos() { return this.movimientos;}
    public void setMovimientos(ArrayList<Movimiento> movimientos) { this.movimientos = movimientos; }

    public void imprimirTicket() {
        Movimiento ultimoMovimiento = this.movimientos.get(this.movimientos.size() - 1);
        System.out.println("\n|         TICKET Numero     1000     |" +
        "\n|    Banco: " + this.banco.getNombre() +
        "\n|    Localizacion: " + this.localizacion
       );
       ultimoMovimiento.imprimirDetalles();
    }

    @Override
    public void Retirar(Cuenta cuenta, String tipoCuenta, double monto) {
        Retiro nuevoRetiro = new Retiro(tipoCuenta, cuenta, monto);
        this.movimientos.add(nuevoRetiro);
    }

    @Override
    public void Transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, String tipoCuenta, double monto) {
        Transferencia nuevaTransferencia = new Transferencia(tipoCuenta, cuentaOrigen, cuentaDestino, monto);
        this.movimientos.add(nuevaTransferencia);
    }

}
