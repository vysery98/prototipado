package BinarySearch;

import java.util.Scanner;

public class MainSearch {

    public static void main(String[] args) {

        // Scanner para lectura de Datos
        Scanner scan = new Scanner(System.in);
        int values[], tamanio;
        System.out.println("Tamaño del arreglo: ");
        tamanio = scan.nextInt();
        values = new int[tamanio];
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 10000000; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    index = j;
                    System.out.println("Número encontrado -> en la posición" + index);
                }
                if (values[j] != 80){
                    System.out.println("No fue posible encontrar el número");
                }
            }
        }
    }
}
