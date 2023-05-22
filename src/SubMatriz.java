public class SubMatriz {
    public static void main(String[] args) {
        int filas, columnas;

        int[][] a = {{4,5,6},{3,4,1},{1,2,3}};
        int[][] b = {{2,0,3},{2,3,1},{1,1,1}};

        filas = a.length;
        columnas = a[0].length;
        int[][] diferencial = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                diferencial[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Resta de dos matrices: ");
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print(diferencial[i][j] + " ");
            }
            System.out.println();
        }
    }
}
