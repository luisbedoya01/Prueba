public class PatronPiramide {
    public static void main(String[] args) {
        int i, j, columna = 6;
        for (i = 0; i < columna; i++) {
            for (j = columna - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
