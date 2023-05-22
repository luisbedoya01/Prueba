import javax.swing.*;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arreglo = {9,14,3,2,43,11,58,22};
        String mensaje = Arrays.toString(arreglo);
        JOptionPane.showMessageDialog(null,"Arreglo antes de Insertion Sort" + '\n' + mensaje);
        insertionSort(arreglo);
        String mensajeSort = Arrays.toString(arreglo);
        JOptionPane.showMessageDialog(null,"Arreglo después de Insertion Sort" + '\n' + mensajeSort);

    }

    public static void insertionSort(int arreglo[]) {
        int numero = arreglo.length;
        for (int j = 1; j < numero; j++) {
            int llave = arreglo[j];
            int i = j - 1;
            while ((i > -1) && (arreglo[i] > llave)) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = llave;
        }
    }
}
