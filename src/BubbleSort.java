import javax.swing.*;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arreglo = {3,60,35,2,45,320,5};
        String mensaje = Arrays.toString(arreglo);
        JOptionPane.showMessageDialog(null,"Arreglo antes de Bubble Sort" + '\n' + mensaje);
        bubbleSort(arreglo);
        String mensajeOrdenado = Arrays.toString(arreglo);
        JOptionPane.showMessageDialog(null,"Arreglo después de Bubble Sort" + '\n' + mensajeOrdenado);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length, temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
