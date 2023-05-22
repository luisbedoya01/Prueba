import java.util.Scanner;

public class PatronDiamante {
    public static void main(String[] args) {
        int columna, i, j, espacio = 1;
        System.out.print("Ingrese el número de columnas: ");
        Scanner lector = new Scanner(System.in);
        columna = lector.nextInt();
        espacio = columna - 1;
        for (j = 1; j <= columna; j++){
            for (i = 1; i <= espacio; i++){
                System.out.print(" ");
            }
            espacio--;
            for (i = 1; i < 2 * (j - 1); i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        espacio = 1;
        for(j = 1; j <= columna - 1; j++) {
            for (i = 1; i <= espacio; i++) {
                System.out.print(" ");
            }
            espacio++;
            for (i = 1; i <= 2 * (columna - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

