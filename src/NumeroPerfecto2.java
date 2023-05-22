import javax.swing.*;

public class NumeroPerfecto2 {
    public static void main(String[] args) {
        long numero, s;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
        s = esPefecto(numero);
        if (s == numero) {
            JOptionPane.showMessageDialog(null, numero + " es un número perfecto");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número perfecto");
        }
    }

    static long esPefecto(long numero) {
        long suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            suma += i;
        }
        return suma;
    }
}
