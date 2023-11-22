public class Tarjeta {

    private String Nombre;
    private String Numero;


    public Tarjeta(String nombre) {
        this.Nombre = nombre;
        this.Numero = this.generarNumero();
    }

    public String getDueno() {
        return this.Nombre;
    }
    public void setDueno(String dueno) {
        this.Nombre = dueno;
    }
    public String getNumero() {
        return this.Numero;
    }
    public void setNumero(String numero) {
        this.Numero = numero;
    }

    private String generarNumero() {
        return this.Nombre + "00001234";
    }
}