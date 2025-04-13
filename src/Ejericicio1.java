import java.util.Scanner;

public class Ejericicio1 {
    public static void main(String[] args) {
        /*
            1. Sistema de Tienda de Abarrotes Desarrolla un programa en Java que simule
            el proceso de compra en una tienda de abarrotes.
            El sistema debe mostrar 3 productos disponibles con sus precios,
            permitir al usuario seleccionar productos y cantidades, calcular el subtotal,
            aplicar un 5% de descuento si el total supera los $15.000,
            y mostrar el total a pagar.
            No se deben usar arreglos ni listas, solo variables simples.
         */

        //Sistema de tiendas de aborrotes
        Scanner sc = new Scanner(System.in);
        String productOne = "Mango";
        String productTwo = "Patilla";
        String productThree = "Frijoles";
        double priceOne = 14.500;
        double priceTwo = 12.000;
        double priceThree = 6.500;
        int amountProductOne = 0;
        int amountProductTwo = 0;
        int amountProductThree = 0;
        double discount = 0.05;
        double valueExceeded = 15.000;
        double totalToPay = 0;
        int option = -1;

        do {
            //creando los productos

            System.out.println("1. Ingresar Productos");
            System.out.println("2. Comprar Productos");
            System.out.println("0. Salir");
            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("Ingrese el producto numero 1: ");
                productOne = sc.nextLine();
                System.out.println("Ingrese el producto numero 2: ");
                productTwo = sc.nextLine();
                System.out.println("Ingrese el producto numero 3: ");
                productThree = sc.nextLine();
            } else if (option == 2) {
                //solicitando las cantidades
                System.out.println("1. Ingrese la cantidad a comprar del producto " + productOne + ": ");
                amountProductOne = sc.nextInt();
                System.out.println("2. Ingrese la cantidad a comprar del producto " + productTwo + ": ");
                amountProductTwo = sc.nextInt();
                System.out.println("3. Ingrese la cantidad a comprar del producto " + productThree + ": ");
                amountProductThree = sc.nextInt();
            } else if (option == 0) {
                totalToPay = (priceOne * amountProductOne) + (priceTwo * amountProductTwo) + (priceThree * amountProductThree);

                if (totalToPay > valueExceeded) {
                    totalToPay = totalToPay - (totalToPay * discount);
                    System.out.println("Se aplicó un descuento a la compra de: " + (totalToPay * discount));
                }

                System.out.println("La cantidad del producto " + productOne + " fue de: " + amountProductOne);
                System.out.println("La cantidad del producto " + productTwo + " fue de: " + amountProductTwo);
                System.out.println("La cantidad del producto " + productThree + " fue de: " + amountProductThree);
                System.out.println("El total a pagar es: " + totalToPay);
            }
        } while (option != 0);
    }
}