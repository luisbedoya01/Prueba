public class MatrizTriangularInferior {
    public static void main(String[] args) {
        int filas, columnas;
        int[][] arreglo = {{1,2,3},{8,6,4},{4,5,6}};

        filas = arreglo.length;
        columnas = arreglo[0].length;

        if (filas != columnas) {
            System.out.println("La matriz debería ser cuadrada");
        } else {
            System.out.println("Matriz triangular inferior");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (j > i)
                        System.out.print("0 ");
                    else
                        System.out.print(arreglo[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
