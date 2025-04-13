import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
            Cafetería DEV:
            Sistema de Pedido Básico Crea un programa de consola para
            una cafetería que ofrezca 3 productos: café, jugo natural y empanadas.
            El cliente podrá seleccionar uno o varios productos e indicar cuántas
            unidades desea de cada uno. Si el subtotal supera los $12.000, se aplica un
            descuento del 8%. El sistema debe mostrar el total final y
            un resumen de la compra. Prohibido usar estructuras de datos complejas.
        */

        Scanner sc = new Scanner(System.in);

        String productOne = "Café";
        String productTwo = "Jugo Natural";
        String productThree = "Empanadas";
        double amountProductOne = 0;
        double amountProductTwo = 0;
        double amountProductThree = 0;
        double priceProductOne = 12.400;
        double priceProductTwo = 6.500;
        double priceProductThree = 8.500;
        double discount = 0.08;
        double valueExeceeded = 12.000;
        double totalToPay = 0;
        int option = 0;

        do {
            System.out.println("Ingrese la cantidad a comprar del café: ");
            amountProductOne = sc.nextInt();
            System.out.println("Ingrese la cantidad a comprar del jugo: ");
            amountProductTwo = sc.nextInt();
            System.out.println("Ingrese la cantidad a comprar del empanadas: ");
            amountProductThree = sc.nextInt();

            totalToPay = (amountProductOne * priceProductOne) + (amountProductTwo * priceProductTwo) + (amountProductThree * priceProductThree);

            if(totalToPay > valueExeceeded) {
                totalToPay = totalToPay - (totalToPay * discount);
            }

            System.out.println("La cantidad del café es de: " + amountProductOne);
            System.out.println("La cantidad del jugo es de: " + amountProductTwo);
            System.out.println("La cantidad del empanadas es de: " + amountProductThree);
            System.out.println("El total a pagar es de: " + Math.round(totalToPay));

        } while (option != 0);

    }
}
