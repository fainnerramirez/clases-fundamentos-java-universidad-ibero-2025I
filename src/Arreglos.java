import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    //arreglos en java
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nElements;
        nElements = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de elementos que tendrá el arreglo: "));
        char[] letters = new char[nElements];

        for (int i=0; i < nElements; i++){
            System.out.println("Ingrese la posición del elemento " + (i +1) + ": ");
            letters[i] = sc.next().charAt(0);
        }

        System.out.println("El arreglo es: " + Arrays.toString(letters));
    }
}
