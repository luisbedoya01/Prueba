public class SumaDeFilaColumna {
    public static void main(String[] args) {
        int filas, columnas, sumFil, sumCol;
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        filas = a.length;
        columnas = a[0].length;
        for (int i = 0; i < filas; i++) {
            sumFil = 0;
            for (int j = 0; j < columnas; j++) {
                sumFil += a[i][j];
            }
            System.out.println("Suma de fila " + (i+1)+ " : " + sumFil);
        }
        for (int i = 0; i < columnas; i++) {
            sumCol = 0;
            for (int j = 0; j < filas; j++) {
                sumCol += a[j][i];
            }
            System.out.println("Suma de columna " + (i+1) + " : " + sumCol);
        }
    }
}
