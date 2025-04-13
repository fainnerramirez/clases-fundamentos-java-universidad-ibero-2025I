import java.util.Scanner;

public class Ejercicio5 {
    /*
    Parqueadero Dev – Cálculo de Tarifas Implementa un sistema para calcular el cobro en un parqueadero.
    El cliente puede elegir entre 3 tipos de vehículos: carro ($4000/hora), moto ($2500/hora),
    o bicicleta ($1000/hora). El programa debe pedir el tipo de vehículo y el número de horas,
    luego calcular el valor total a pagar.
    Si el parqueo es mayor a 5 horas, se aplica un 20% de descuento.
    Usar solo variables y condicionales.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeTransportOne = "Carro";
        String typeTransportTwo = "Moto";
        String typeTransportThree = "Bicicleta";

        double totalToPay = 0;
        double PriceTransportOne = 4000;
        double PriceTransportTwo = 2500;
        double PriceTransportThree = 1000;
        double numbersHours = 0;
        int option = -1;
        int optionVehicle = -1;

        do {
            System.out.println("1. Ingrese al parqueadero");
            System.out.println("0. Salir");
            option = sc.nextInt();
            sc.nextLine();

            if(option == 1) {
                System.out.println("* Ingrese el tipo de vehículo ");
                System.out.println("1." + typeTransportOne);
                System.out.println("2." + typeTransportTwo);
                System.out.println("3." + typeTransportThree);
                optionVehicle = sc.nextInt();
                sc.nextLine();
                System.out.println("* Ingrese las horas a ocupar: ");
                numbersHours = sc.nextDouble();
            }
        } while (option != 0);

        double priceSelectedUser = 0;

        if(optionVehicle == 1){
            priceSelectedUser = PriceTransportOne;
        }
        else if(optionVehicle == 2){
            priceSelectedUser = PriceTransportTwo;
        }
        else if(optionVehicle == 3){
            priceSelectedUser = PriceTransportThree;
        }

        totalToPay = (numbersHours * priceSelectedUser);

        System.out.println("========== DATOS DEL PARQUEADERO ===========");
        System.out.println("El tipo de vehiculo es: " + (optionVehicle == 1 ? "Carro" : (optionVehicle == 2 ? "Moto" : "Bicicleta")));
        System.out.println("Las horas a ocupar son " + numbersHours + " horas");
        System.out.println("El total a pagar es de: " + totalToPay);
    }
}