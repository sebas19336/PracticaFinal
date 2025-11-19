
import java.util.Scanner;

public class controlador {
    public Scanner sc = new Scanner(System.in);
    public validaciones valid = new validaciones();
    public void principal(){
        int opt;
        boolean band = true;
        while (band) {
            System.out.println("Bienvenido a ");
            System.out.println("Equipos.Electronicos\nSan juan de dios");
            System.out.println("1. Estudiantes Ingenierias");
            System.out.println("2. Estudiantes Diseño");
            System.out.println("3. Inventario");
            System.out.println("4. Salir");
            opt = valid.ValidarEnteroRngprinc(sc);
            switch (opt) {
                case 1 -> submenu();
                case 2 -> submenu();
                case 3 -> submenu();
                case 4 -> {
                    System.out.println("Hasta luego.");
                    band = false;
                }
            }
        }
        

    }
    public void submenu() {
        System.out.println("""
                           1. Registrar prestamo
                           2. Modificar Prestamo
                           3. Devolucion de equipo
                           4. buscar equipo
                           5. volver al menu principal
                           """);
        int entry = sc.nextInt();
        switch (entry) {
            case 1 -> {
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> { principal();
            }
        }
    }
}
