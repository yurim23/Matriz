import models.Operacion;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        short n;
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        n = keyboard.nextShort();
        int[][] array = new int[n][n];
        int[][] array2 = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = keyboard.nextShort();
            }
        }
        System.out.println();
        System.out.println("Ingrese la segunda matriz: \n");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = keyboard.nextInt();
            }
        }
        Operacion operacion = new Operacion();
        operacion.setSize(n);
        operacion.setData(array);
        operacion.setData2(array2);
        operacion.multiplicarMatriz();
        int[][] aux = operacion.getResultado();
        System.out.println();
        System.out.println("Matriz resultante");
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                System.out.println(aux[i][j] + " ");
            }
            System.out.println();
        }
    }
}