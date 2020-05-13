package BinarySearch;

import java.util.Scanner;

public class MainSearch {

    public static void main(String[] args) {

        // Scanner para lectura de Datos
        Scanner scan = new Scanner(System.in);

        // Declaración de datos
        int values[], tamanio;

        // Ingreso de datos
        System.out.println("Tamaño del arreglo: ");
        tamanio = scan.nextInt();

        // Inicialización de array
        values = new int[tamanio];

        // Generación de datos aleatorios para array
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 100);
        }

        // Proceso de búsqueda binaria
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
