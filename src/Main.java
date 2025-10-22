import java.util.Scanner;
import java.util.logging.SocketHandler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba la lista de la tarjeta: ");
        double limite = lectura.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;

    }
}