import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60};
        System.out.print("Ingrese elemento a buscar en el arreglo: ");
        Scanner sc = new Scanner(System.in);
        int llave = sc.nextInt();
        int ultimo = arreglo.length - 1;
        busquedaBinaria(arreglo,0,ultimo, llave);
    }

    public static void busquedaBinaria(int[] arr, int primero, int ultimo, int llave) {
        int medio = (primero + ultimo) / 2;
        while (primero <= ultimo) {
            if (arr[medio] < llave) {
                primero = medio + 1;
            } else if (arr[medio] == llave) {
                System.out.println("Elmento se encuentra en el índice: " + medio);
                break;
            } else {
                ultimo = medio - 1;
            }
            medio = (primero + ultimo) / 2;
        }
        if (primero > ultimo){
            System.out.println("Elemento no encontrado!");
        }
    }
}
