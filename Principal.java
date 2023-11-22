import java.util.Scanner;

public class Principal {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    // Instanciar banco y registrar tres cuentas
    Banco banamex = new Banco("banamex");
    banamex.registrarCuenta("Daniel", "#191 Valle del bajo", "ahorro");
    banamex.registrarCuenta("Juan", "#2290 11 de Marzo", "cheque");
    banamex.registrarCuenta("Sonia", "#140 Avenida Euclides", "cheque");

    // Instanciar un cajero automatico del banco banamex
    Cajero cajero = new Cajero("Plaza de los tigres", banamex);

    // Simulacion
    System.out.println("Cuentas disponibles: ");
    for (Cuenta cuenta : banamex.cuentas) {
      System.out.println("Cuenta: " + cuenta.getNumeroDeCuenta() + " Tarjeta: " + cuenta.getCliente().getTarjeta().getNumero() + " Tipo: " + cuenta.getTipo());
    }
    System.out.println();
    int transaccion = -1;
    do {
      System.out.println("BIENVENIDO");
      // Solicilar el ingreso de la tarjeta
      System.out.print("Ingrese su tarjeta de debito: ");
      String numTarjeta = scanner.nextLine();

      // Seleccionar tipo de cuenta
      System.out.print("Tipo de cuenta: ");
      String tipoCuenta = scanner.nextLine();

      // Buscar cuenta del usuario
      Cuenta cuenta = banamex.buscarCuenta(numTarjeta, tipoCuenta);
      if (cuenta == null) { 
        System.out.println("Cuenta no encontrada");
      continue; }

      // Transaccion a realizar
      System.out.println("Transaccion a realizar: ");
      System.out.println("Presione: 1) Retiro \nPresione: 2) Transferencia \nPresione: 3) Salir " );
      transaccion = Integer.parseInt(scanner.nextLine());

      if (transaccion == 1) {
        // Ingresar monto
        System.out.print("Ingrese monto: ");
        double monto = Double.parseDouble(scanner.nextLine());

        cajero.Retirar(cuenta, tipoCuenta, monto);
        cajero.imprimirTicket();
      }
      if (transaccion == 2) {
        // Cuenta a transferir
        System.out.print("Cuenta a transferir: ");
        String cuentaNum = scanner.nextLine();

        Cuenta cuentaDestino = banamex.buscarCuenta(cuentaNum);
        while (cuentaDestino == null) {
          System.out.println("Cuenta destino no encontrada.");
          System.out.print("Intente de nuevo. Cuenta a transferir: ");
          cuentaNum = scanner.nextLine();
          cuentaDestino = banamex.buscarCuenta(cuentaNum);
        }

        // Ingresar monto
        System.out.print("Ingreso monto: ");
        double monto = Double.parseDouble(scanner.nextLine());

        cajero.Transferir(cuenta, cuentaDestino, tipoCuenta, monto);
        cajero.imprimirTicket();
      }
    } while ( transaccion != 3 );
  }
}
