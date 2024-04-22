package models;

public class Operacion {
    private int[][] data;
    private int[][] data2;
    private int[][] resultado;

    public void setSize(short n){
        data = new int[n][n];
        data2= new int[n][n];
        resultado = new int[n][n];
    }
    public void setData(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++)
                data[i][j] = array[i][j];
        }
    }
    public void setData2(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++)
                data2[i][j] = array[i][j];
        }
    }

    public void multiplicarMatriz(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int suma = 0;
                for (int k = 0; k < data.length; k++) {
                    suma += data[i][k]*data2[k][j];
                }
                resultado[i][j] = suma;
            }
        }
    }
    public int[][] getResultado() {
        return resultado;
    }
}
