public class PatronPiramideInverso {
    public static void main(String[] args) {
        int columnas = 8;
        for (int i = 0; i <= columnas - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= columnas - 1 - i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
