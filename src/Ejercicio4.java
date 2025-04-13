import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*
        Papelería Escolar –
        Registro de Venta Escribe un programa que permita a un cliente
        de una papelería comprar 3 productos (lápices, cuadernos y colores).
        El usuario debe ingresar la cantidad deseada de cada producto.
        El sistema debe calcular el subtotal,
        aplicar un 10% de descuento si se compran más de 10 unidades en total,
        y mostrar el total a pagar. No se permite el uso de arrays, listas, ni objetos.
         */

        Scanner sc = new Scanner(System.in);
        String productOne = "Lapices";
        String productTwo = "Cuadernos";
        String productThree = "Colores";

        int amountProductOne = 0;
        int amountProductTwo = 0;
        int amountProductThree = 0;

        double totalToPay = 0;
        double totalPriceOne = 13.500;
        double totalPriceTwo = 5.000;
        double totalPriceThree = 5.000;
        double discount = 0.10;

        int option = -1;

        do {
            System.out.println("1. Comprar Productos");
            System.out.println("0. Salir");
            option = sc.nextInt();
            sc.nextLine();

            if(option == 1){
                System.out.println("* Ingrese la cantidad de " + productOne);
                amountProductOne = sc.nextInt();
                System.out.println("* Ingrese la cantidad de " + productTwo);
                amountProductTwo = sc.nextInt();
                System.out.println("* Ingrese la cantidad de " + productThree);
                amountProductThree = sc.nextInt();
            }
        } while (option != 0);

        totalToPay = (amountProductOne * totalPriceOne) + (amountProductTwo * totalPriceTwo) + (amountProductThree * totalPriceThree);
        int totalAmounProduct = amountProductOne + amountProductTwo + amountProductThree;

        if(totalAmounProduct > 10){
            totalToPay = totalToPay - (totalToPay * discount);
        }

        System.out.println("La cantidad de " + productOne + " es de: " + amountProductOne);
        System.out.println("La cantidad de " + productTwo + " es de: " + amountProductTwo);
        System.out.println("La cantidad de " + productThree + " es de: " + amountProductThree);
        System.out.println("El total a pagar es de: " + totalToPay);
    }
}