import java.util.Scanner;

public class EjemploATM {
    public static void main(String[] args) {
        int saldo = 100000,retiro,deposito;

        Scanner lector = new Scanner(System.in);

        while(true){
            //System.out.println("--------------------------------------------");
            System.out.println("            Cajero Automático");
            System.out.println(" 1. Retirar");
            System.out.println(" 2. Depositar");
            System.out.println(" 3. Consultar saldo");
            System.out.println(" 4. Salir");
            System.out.print(" Seleccione la opción: ");
            /*System.out.println();
            System.out.println("--------------------------------------------");*/

            int opcion = lector.nextInt();
            switch (opcion){
                case 1:
                    System.out.print(" Ingrese el monto a retirar: ");
                    retiro = lector.nextInt();
                    if (saldo >= retiro) {
                        saldo -= retiro;
                        System.out.println("Puede retirar su dinero");
                    } else {
                        System.out.println("¡Saldo insuficiente!");
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print(" Ingrese el monto a depositar: ");
                    deposito = lector.nextInt();
                    saldo += deposito;
                    System.out.println("¡Su dinero ha sido deposito exitósamente!");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Saldo: " + saldo);
            }
        }
    }
}
