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
    public int ValidarEntero(Scanner sc) {
        int numero = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero.");
            sc.next();
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
    public int ValidarEnteroRngsubmenuIng(Scanner sc) {
        int numero = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero.");
            sc.next();
        }
        numero = sc.nextInt();
        if (numero < 1 || numero >5) {
                System.out.println("Ingrese un valor valido");
                
            }
        return numero;
    }
   public int ValidarEnteroRngsubmenuIng2(Scanner sc) {
    int numero;
    while (!sc.hasNextInt()) {
        System.out.println("Por favor ingrese un número.");
        sc.next();
    }

    numero = sc.nextInt();

    if (numero < 1 || numero > 2) {
            System.out.println("Ingrese un valor válido (1 o 2).");
            return ValidarEnteroRngsubmenuIng2(sc);
        }

        return numero;
    }

    public String SoloNumstr(String cadena){
        String men=cadena;
        if (cadena == null || !cadena.matches("^[0-9]+$")) {
            System.out.println("Caracter invalido.");
            System.out.println("Ingrese un valor valido.");
            men = sc.next();
            SoloNumstr(men);
        }
      return men;
    }
    public String SoloString(String cadena){
        String men=cadena;
        if (cadena == null || !cadena.matches("^[a-z-A-Z]+$")) {
            System.out.println("Caracter invalido.");
            System.out.println("Ingrese un valor valido.");
            men = sc.next();
            SoloString(men);
        }
      return men;
    }
    public int SoloInt(String cadena) {
    if (cadena.matches("^-?\\d+$")) {
        return Integer.parseInt(cadena);
    }
    System.out.println("Caracter invalido.");
    System.out.println("Ingrese un valor valido.");
    String nuevo = sc.next();

    return SoloInt(nuevo);
    }
    public Float SoloFloat(String cadena) {
    if (cadena.matches("^-?\\d*(\\.\\d+)?$")) {
        return Float.parseFloat(cadena);
    }
    System.out.println("Caracter invalido.");
    System.out.println("Ingrese un valor valido.");
    String nuevo = sc.next();

    return SoloFloat(nuevo);
    }
}
