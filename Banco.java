import java.util.ArrayList;

public class Banco {
    private String nombre;
    ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ArrayList<Cuenta> getCuentas() { return this.cuentas;}
    public void setCuentas(ArrayList<Cuenta> cuentas) { this.cuentas = cuentas; }

    public Cuenta buscarCuenta(String tarjeta, String tipo) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCliente().getTarjeta().getNumero().equals(tarjeta) && cuentas.get(i).getTipo().equals(tipo)) {
                return cuentas.get(i);
            }
        }
        return null;
    }

    public Cuenta buscarCuenta(String numeroDeCuenta) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumeroDeCuenta().equals(numeroDeCuenta)) {
                return cuentas.get(i);
            }
        }
        return null;
    }

    public void registrarCuenta(String nombre, String direccion, String tipo) {
        Tarjeta nuevaTarjeta = new Tarjeta(nombre);
        Cliente nuevoCliente = new Cliente(nombre, direccion, nuevaTarjeta);
        Cuenta nuevaCuenta = new Cuenta(this.generarNumero(), nuevoCliente, tipo);

        this.cuentas.add(nuevaCuenta);
    }

    private String generarNumero() {
        String Resultado = "";
        for(int i = 0; i<=8; i++){

            String Alfanumericos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890123456789";
            int PosicionRandom = (int)(Math.random()*45 + 1);
            Resultado += Alfanumericos.charAt(PosicionRandom);  
        }
        return this.nombre.charAt(0) + Resultado;
    }


    
}