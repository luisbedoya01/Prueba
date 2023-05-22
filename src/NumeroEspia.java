import java.util.Scanner;

public class NumeroEspia {
    public static void main(String[] args) {
        int num, producto = 1, suma = 0, ultimoDigito;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese número para comprobar: ");
        num = lector.nextInt();
        while (num > 0) {
            ultimoDigito = num % 10;
            suma += ultimoDigito;
            producto *= ultimoDigito;
            num /= 10;
        }
        if (suma == producto) {
            System.out.println("Es número espía");
        } else{
            System.out.println("No es número espía");
        }
    }
}
