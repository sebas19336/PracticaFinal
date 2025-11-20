
import java.util.LinkedList;
import java.util.Scanner;

public class vectores {
    public LinkedList<modelo.estudianteDis> vector_disenadores = new LinkedList<>();
    public LinkedList<modelo.estudianteIng> vector_ingenieros = new LinkedList<>();
    public LinkedList<modelo.tablet> vector_tableta = new LinkedList<>();
    public LinkedList<modelo.portatil> vector_portatil = new LinkedList<>();
    public Scanner sc = new Scanner(System.in);
    public  validaciones valid = new validaciones();
    
    public void LlenadoVectores(){
        int opt,con;
        boolean band = true;
        while (band) {
            System.out.println("Llenado de vectores.");
            System.out.println("1. Estudiante ingenieria");
            System.out.println("2. Estudiante Diseño");
            System.out.println("3. Tablet");
            System.out.println("4. Computador portatil");
            opt = valid.ValidarEnteroRngprinc(sc);
            switch (opt) {
                case 1 -> vector_ingenieros.add(ing());
                case 2 -> vector_disenadores.add(Dis());
                case 3 -> vector_tableta.add(tablet());
                case 4 -> vector_portatil.add(portatil());
            }
            System.out.println("Desea seguir llenando vectores?\n1.si y 2.no");
            con = sc.nextInt();
            if (con == 2) {
                band = false;
            }
        }

    }

    public modelo.estudianteIng ing (){
    modelo m = new modelo();
    modelo.estudianteIng o = m.new estudianteIng();
    System.out.println("Ingrese el nombre.");
    String nombre = sc.next();
    o.setNombre(valid.SoloString(nombre));
    System.out.println("Ingrese el primer apellido.");
    String apellido = sc.next();
    o.setApellido(valid.SoloString(apellido));
    System.out.println("Ingrese la cc o ti");
    String cedula = sc.next();
    o.setCedula(valid.SoloNumstr(cedula));
    System.out.println("Ingrese un numero telefonico.");
    String telefono = sc.next();
    o.setTelefono(valid.SoloNumstr(telefono));
    System.out.println("Ingrese el semestre que esta cursando.");
    String nroSemestre = sc.next();
    o.setNroSemestre(valid.SoloInt(nroSemestre));
    System.out.println("Ingrese el promedio acumulado.");
    String promAcum = sc.next();
    o.setPromAcum(valid.SoloFloat(promAcum));
    System.out.println("Ingrese el serial asignado.");
    String SerialI = sc.next();
    o.setSerialI(valid.SoloNumstr(SerialI));
    return o;
   }
    public modelo.estudianteDis Dis (){
    modelo m = new modelo();
    modelo.estudianteDis o = m.new estudianteDis();
    System.out.println("Ingrese el nombre.");
    String nombre = sc.next();
    o.setNombre(valid.SoloString(nombre));
    System.out.println("Ingrese el primer apellido.");
    String apellido = sc.next();
    o.setApellido(valid.SoloString(apellido));
    System.out.println("Ingrese un numero telefonico.");
    String telefono = sc.next();
    o.setTelefono(valid.SoloNumstr(telefono));
    System.out.println("Ingrese la modalidad de estudio \n[virtual-presencial]");
    String  modalidad= sc.next();
    o.setModalidad(valid.SoloString(modalidad));
    System.out.println("Ingrese la cantidad de materias que esta cursando.");
    String cantidadMa = sc.next();
    o.setCantidadMa(valid.SoloInt(cantidadMa));
    System.out.println("Ingrese el serial asignado.");
    String SerialD = sc.next();
    o.setSerialD(valid.SoloInt(SerialD));
    return o;
   }
    public modelo.tablet tablet(){
        modelo m = new modelo();
        modelo.tablet o = m.new tablet();
        System.out.println("Ingrese el serial del equipo.");
        String Serial = sc.next();
        o.setSerial(valid.SoloNumstr(Serial));
        System.out.println("Ingrese la marca del equipo.");
        String Marca = sc.next();
        o.setMarca(valid.SoloString(Marca));
        System.out.println("Ingrese el tamaño del equipo.\n[pulgadas]");
        String Tamaño = sc.next();
        o.setTamaño(valid.SoloFloat(Tamaño));
        System.out.println("Ingrese el precio del equipo.");
        String Precio = sc.next();
        o.setPrecio(valid.SoloFloat(Precio));
        o.setAlmacen(submenu());
        System.out.println("Ingrese el peso del equipo.\n[kilogramos]");
        String peso = sc.next();
        o.setPeso(valid.SoloFloat(peso));
        return o;
    }
    public int submenu(){
        int opt;
        int rep=0;
        System.out.println("Almacenamiento.");
        System.out.println("1. 256GB");
        System.out.println("2. 512GB");
        System.out.println("3. 1TB");
        opt = valid.ValidarEnteroRngalm(sc);
        switch (opt) {
            case 1 -> rep = 256;
            case 2 -> rep = 512;
            case 3 -> rep = 1000;
        }
        return rep;
    }
    public modelo.portatil portatil(){
        modelo m = new modelo();
        modelo.portatil o = m.new portatil();
        System.out.println("Ingrese el serial del equipo.");
        String Serial = sc.next();
        o.setSerial(valid.SoloNumstr(Serial));
        System.out.println("Ingrese la marca del equipo.");
        String Marca = sc.next();
        o.setMarca(valid.SoloString(Marca));
        System.out.println("Ingrese el tamaño del equipo.\n[pulgadas]");
        String Tamaño = sc.next();
        o.setTamaño(valid.SoloFloat(Tamaño));
        System.out.println("Ingrese el precio del equipo.");
        String Precio = sc.next();
        o.setPrecio(valid.SoloFloat(Precio));
        System.out.println("Ingrese el sistema operativo.");
        String sysOp =SistemaOperativo() ;
        o.setSysOp(sysOp);
        System.out.println("Ingrese el procesador.");
        String Procesador = Procesador();
        o.setProcesador(Procesador);
        return o;
    }
    public String SistemaOperativo(){
        int opt;
        String rep="";
        System.out.println("Sistema operativo.");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Window 11");
        opt = valid.ValidarEnteroRngSysop(sc);
        switch (opt) {
            case 1 -> rep = "Windows 7";
            case 2 -> rep = "Windows 10";
            case 3 -> rep = "Windows 11";
        }
        return rep;
    }
    public String Procesador(){
        int opt;
        String rep="";
        System.out.println("Procesador.");
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel Core i5");
        opt = valid.ValidarEnteroRngProc(sc);
        switch (opt) {
            case 1 -> rep = "AMD Ryzen";
            case 2 -> rep = "Intel Core i5";
        }
        return rep;
    }
}
