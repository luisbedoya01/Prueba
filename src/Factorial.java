public class Factorial {

    public static void main(String[] args) {
        System.out.println("El factorial de 10 es : " + obtenerFactorial(10));
        System.out.println("El factorial de 5 es: " + obtenerFactorial(5));
        System.out.println("El factorial de 7 es: " + obtenerFactorial(7));
    }

    static double obtenerFactorial(int numero) {
        if (numero >= 0) {
            double factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
        return -1;
    }
}
