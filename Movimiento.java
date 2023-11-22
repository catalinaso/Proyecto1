import java.util.Date;

public abstract class Movimiento{
    private static int contador = 1;
    private String Identificador;
    private Date Fecha;
    private String Tipo;
    private double Monto;

    public Movimiento(){
        this.Identificador = "";
        this.Tipo = "";
        this.Monto = 0.0;
        this.Fecha = new Date();
    }

    public Movimiento(String tipo, double monto){
        this.Tipo = tipo;
        this.Monto = monto;
        this.Identificador = this.generarIdentificador();
        this.Fecha = new Date();
    }

    public String getIdentificador() {
        return this.Identificador;
    }

    public void setIdentificador(String identificador) {
        this.Identificador = identificador;
    }

    public Date getFecha() {
        return this.Fecha;
    }

    public void setFecha(Date fecha) {
        this.Fecha = fecha;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public double getMonto() {
        return this.Monto;
    }

    public void setMonto(double monto) {
        this.Monto = monto;
    }

    private String generarIdentificador() {
        String identificador = "";
        int FolioInt =(int)(Math.random()*10000+ 1);
        identificador = FolioInt + "_" + contador;
        contador++;

        return identificador;
    }

    public abstract void imprimirDetalles();
}