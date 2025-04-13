import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Cine Devflix
            Venta de Boletos Realiza un programa en Java que permita simular
            la venta de entradas en un cine. Debes tener 3 tipos de boletos:
            general ($8000), VIP ($12000), y infantil ($5000).
            El usuario debe seleccionar el tipo de entrada y cuántas quiere comprar.
            Si compra más de 3 entradas, se aplica un descuento del 15%.
            El programa debe mostrar el total a pagar. Usar solo variables simples.
         */

        Scanner sc = new Scanner(System.in);
        double totalToPay = 0;
        double discount = 0.15;

        String typeTicketOne = "general";
        String typeTicketTwo = "VIP";
        String typeTicketThree = "infantil";

        double amountProductOne = 0;
        double amountProductTwo = 0;
        double amountProductThree = 0;

        double priceTicketOne = 8000;
        double priceTicketTwo = 12000;
        double priceTicketThree = 5000;
        int option = 0;

        do {
            System.out.println("1. Ingresar cantidades \n");
            System.out.println("0. Salir\n");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Ingrese la cantidad de entradas " + typeTicketOne + " a comprar: ");
                amountProductOne = sc.nextInt();
                System.out.println("Ingrese la cantidad de entradas " + typeTicketTwo + " a comprar: ");
                amountProductTwo = sc.nextInt();
                System.out.println("Ingrese la cantidad de entradas " + typeTicketThree + " a comprar: ");
                amountProductThree = sc.nextInt();
            }
        } while (option != 0);

        totalToPay = (amountProductOne * priceTicketOne) + (amountProductTwo * priceTicketTwo) + (amountProductThree * priceTicketThree);

        System.out.println("========== DATOS DE LA COMPRA ===========");
        System.out.println("La cantidad de boletas GENERAL es de: " + amountProductOne);
        System.out.println("La cantidad de boletas VIP es de: " + amountProductTwo);
        System.out.println("La cantidad de boletas INFANTIL es de: " + amountProductThree);
        System.out.println("El total de compra de las entradas es de: " + totalToPay);
    }
}
