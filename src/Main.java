import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el límite de la tarjeta: ");
        double limite = lectura.nextDouble();
        // **PASO 1: Limpiar el búfer después de nextDouble()**
        lectura.nextLine(); // Consumir el salto de línea pendiente

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while(salir != 0) {

            // **PASO 2: Usar nextLine() para la descripción**
            System.out.println("Escriba el objeto a comprar:");
            String descripcion = lectura.nextLine(); // Acepta la línea completa

            System.out.println("Escriba el valor de la compra:");
            // Para el valor, es mejor seguir usando lectura.nextDouble()
            // y luego limpiar el búfer, o leer como String y convertir.
            // Para simplicidad, leemos directamente y limpiamos después.
            double valor = lectura.nextDouble();
            lectura.nextLine(); // Limpiar el búfer después de nextDouble()

            Compra compra = new Compra(valor, descripcion);
            // ... (resto del código igual)
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");

                // Leemos la opción y limpiamos el búfer si es 1
                salir = lectura.nextInt();
                if (salir != 0) {
                    lectura.nextLine(); // Limpiar el búfer para el siguiente loop
                }
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Compra compra : tarjeta.getListaDeCompras()) {
            System.out.println(compra.getDescripcion() + " - " +compra.getValor());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " +tarjeta.getSaldo());
    }
}