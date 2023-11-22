public class Cuenta{
    
    private String NumeroDeCuenta;
    private Cliente cliente;
    private String Tipo;

    public Cuenta(String numeroDeCuenta, Cliente cliente, String tipo) {
        
        this.NumeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.Tipo = tipo;
    }
    
    public String getNumeroDeCuenta() {
        return this.NumeroDeCuenta;
    }
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.NumeroDeCuenta = numeroDeCuenta;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getTipo() {
        return this.Tipo;
    }
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
}