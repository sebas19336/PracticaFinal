import java.util.Scanner;

public class validaciones {
    Scanner sc = new Scanner(System.in);
    public int ValidarEnteroRngprinc(Scanner sc) {
        int numero = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero.");
            sc.next();
        }
        numero = sc.nextInt();
        if (numero < 1 || numero >4) {
                System.out.println("Ingrese un valor valido");
                
            }
        return numero;
    }
    public int ValidarEnteroRngalm(Scanner sc) {
        int numero = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero.");
            sc.next();
        }
        numero = sc.nextInt();
        if (numero < 1 || numero >3) {
                System.out.println("Ingrese un valor valido");
                
            }
        return numero;
    }
    public int ValidarEnteroRngSysop(Scanner sc) {
        int numero = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero.");
            sc.next();
        }
        numero = sc.nextInt();
        if (numero < 1 || numero >3) {
                System.out.println("Ingrese un valor valido");
                
            }
        return numero;
    }
    public int ValidarEnteroRngProc(Scanner sc) {
        int numero = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero.");
            sc.next();
        }
        numero = sc.nextInt();
        if (numero < 1 || numero >2) {
                System.out.println("Ingrese un valor valido");
                
            }
        return numero;
    }
}
