public interface Transferencias{

    void Retirar(Cuenta cuenta, String tipo, double monto);
    void Transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, String tipo, double monto);
    
}