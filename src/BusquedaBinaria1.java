import java.util.Scanner;

public class BusquedaBinaria1 {
    public static void main(String[] args) {
        int[] arreglo = {10,20,30,40,50,60};
        System.out.print("Ingrese elemento a buscar en el arreglo: ");
        Scanner sc = new Scanner(System.in);
        int llave = sc.nextInt();
        int ultimo = arreglo.length - 1;
        int resultado = busquedaBinaria(arreglo,0,ultimo,llave);
        if (resultado == -1) {
            System.out.println("Elemento no encontrado!");
        } else {
            System.out.println("Elemento se encuentra en el índice: " + resultado);
        }
    }

    public static int busquedaBinaria(int[] arr, int primero, int ultimo, int llave) {
        if (ultimo >= primero) {
            int medio = primero + (ultimo - primero) / 2;
            if (arr[medio] == llave) {
                return medio;
            }
            if (arr[medio] > llave) {
                return busquedaBinaria(arr,primero,medio -1,llave);
            } else {
                return busquedaBinaria(arr,medio +1,ultimo,llave);
            }
        }
        return -1;
    }
}
