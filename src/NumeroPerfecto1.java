import javax.swing.*;

public class NumeroPerfecto1 {
    public static void main(String[] args) {
        long n, suma = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                suma += i;
            }
            i++;
        }
        if (suma == n) {
            JOptionPane.showMessageDialog(null, n + " es un número perfecto");
        } else {
            JOptionPane.showMessageDialog(null, n + " no es un número perfecto");
        }
    }
}
