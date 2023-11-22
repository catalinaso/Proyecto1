public class Cliente {
    
    private String Nombre;
    private String Direccion;
    private Tarjeta Tarjeta;
    private static int contador = 0;
    private int Identificador;


    public Cliente(){
        super();
        this.Nombre = "";
        this.Direccion = "";
        this.Identificador = contador;
        contador++;
    }

    public Cliente(String nombre, String direccion, Tarjeta tarjeta){
        super();
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.Tarjeta = tarjeta;
    }

    public String getDireccion() {
        return this.Direccion;
    }
    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }
    public Tarjeta getTarjeta() {
        return this.Tarjeta;
    }
    public void setTarjeta(Tarjeta tarjeta) {
        this.Tarjeta = tarjeta;
    }
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getIdentificador() {
        return this.Identificador;
    }
    public void setIdentificador(int identificador) {
        this.Identificador = identificador;
    }
}