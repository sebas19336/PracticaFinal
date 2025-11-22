import java.util.Scanner;

public class controlador {
    public Scanner sc = new Scanner(System.in);
    public vectores v;
    public validaciones valid = new validaciones();
    public void principal(){
        int opt;
        boolean band = true;
        while (band) {
            System.out.println("Bienvenido a ");
            System.out.println("Equipos.Electronicos\nSan juan de dios");
            System.out.println("1. Estudiantes Ingenieria");
            System.out.println("2. Estudiantes Diseño");
            System.out.println("3. Inventario");
            System.out.println("4. Salir");
            opt = valid.ValidarEnteroRngprinc(sc);
            switch (opt) {
                case 1 -> submenuIng();
                case 3 -> Inventario();
                case 4 -> {
                    System.out.println("Hasta luego.");
                    band = false;
                }
            }
        }
        

    }
    public void submenuIng() {
        System.out.println("""
                           1. Registrar prestamo
                           2. Modificar Prestamo
                           3. Devolucion de equipo
                           4. buscar equipo
                           5. volver al menu principal
                           """);
        int entry = valid.ValidarEnteroRngsubmenuIng(sc);
        boolean band = true;
        while (band) {
         switch (entry) {
            case 1 -> {
                RegistrarPrestamoIng();
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> { 
                principal();
            }
        }   
        }
    }
   public void RegistrarPrestamoIng(){
        System.out.println("Como desea continuar el prestamo?");
        System.out.println("1. Cedula");
        System.out.println("2. Serial estudiante");
        int elec ;
        elec = valid.ValidarEnteroRngsubmenuIng2(sc);
        if (elec ==1) {
            System.out.println("Ingrese la cedula.");
            String ced = sc.next();
            valid.SoloNumstr(ced);
            modelo.estudiante estudiante = null;

            for (modelo.estudianteIng i : v.vector_ingenieros) {
                if (i.getCedula().equals(ced)) {
                    estudiante = i;
                    break;
                }
            }

            if (estudiante == null) {
                System.out.println("El estudiante no fue encontrado");   
                submenuIng();             
            }

            System.out.println("Que tipo de equipo desea prestar?.");
            System.out.println("1. Tablet.");
            System.out.println("2. Computador Portatil.");
            int opt;
            opt = valid.ValidarEnteroRngsubmenuIng2(sc);
            if (opt == 1) {
                System.out.println("Tablets disponibles.");
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Peso: " + i.getPeso()+".");
                    System.out.println("Almacenamiento: " + i.getAlmacen()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial de la tablet a prestar.");
                String serial=sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Tablet asignada exitosamente.");
                submenuIng();
            } else{
                System.out.println("Computadores disponibles.");
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Procesador: " + i.getProcesador()+".");
                    System.out.println("Sistema operativo: " + i.getSysOp()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial del computador a prestar.");
                String serial = sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Computador asigando exitosamente.");  
                submenuIng();              
            }
        } else{
            System.out.println("Ingrese el serial del estudiante.");
            String ced = sc.next();
            valid.SoloNumstr(ced);

            modelo.estudiante estudiante = null;

            for (modelo.estudianteIng i : v.vector_ingenieros) {
                if (i.getSerialI().equals(ced)) {
                    estudiante = i;
                    break;
                }
            }

            if (estudiante == null) {
                System.out.println("El estudiante no fue encontrado");    
                submenuIng();            
            }

            System.out.println("Que tipo de equipo desea prestar?.");
            System.out.println("1. Tablet.");
            System.out.println("2. Computador Portatil.");
            int opt;
            opt = valid.ValidarEnteroRngsubmenuIng2(sc);
            if (opt == 1) {
                System.out.println("Tablets disponibles.");
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Peso: " + i.getPeso()+".");
                    System.out.println("Almacenamiento: " + i.getAlmacen()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial de la tablet a prestar.");
                String serial = sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Tablet asignada exitosamente.");
                submenuIng();
            } else{
                System.out.println("Computadores disponibles.");
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Procesador: " + i.getProcesador()+".");
                    System.out.println("Sistema operativo: " + i.getSysOp()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial del computador a prestar.");
                String serial= sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Computador asigando exitosamente.");  
                submenuIng();              
            }
        } 
   }
   public void ModificarPrestamoIng(){
    System.out.println("Como desea seguir con su modificacion?.");
    System.out.println("1. Cedula  2. Serial");
    int opt = valid.ValidarEnteroRngsubmenuIng2(sc);
    if (opt == 1) {
        String ced = sc.next();
        valid.SoloNumstr(ced);
        for (modelo.estudianteIng i : v.vector_ingenieros) {
            if (i.getCedula().equals(ced)) {
                
            }
        }
    }
   }
   public void submenuDis() {
        System.out.println("""
                           1. Registrar prestamo
                           2. Modificar Prestamo
                           3. Devolucion de equipo
                           4. buscar equipo
                           5. volver al menu principal
                           """);
        int entry = valid.ValidarEnteroRngsubmenuIng(sc);
        boolean band = true;
        while (band) {
         switch (entry) {
            case 1 -> {
                RegistrarPrestamoDis();
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> { 
                principal();
            }
        }   
        }
    }
   public void RegistrarPrestamoDis(){
        System.out.println("Como desea continuar el prestamo?");
        System.out.println("1. Cedula");
        System.out.println("2. Serial estudiante");
        int elec ;
        elec = valid.ValidarEnteroRngsubmenuIng2(sc);
        if (elec ==1) {
            System.out.println("Ingrese la cedula.");
            String ced = sc.next();
            valid.SoloNumstr(ced);
            modelo.estudiante estudiante = null;

            for (modelo.estudianteDis i : v.vector_disenadores) {
                if (i.getCedula().equals(ced)) {
                    estudiante = i;
                    break;
                }
            }

            if (estudiante == null) {
                System.out.println("El estudiante no fue encontrado");   
                submenuIng();             
            }

            System.out.println("Que tipo de equipo desea prestar?.");
            System.out.println("1. Tablet.");
            System.out.println("2. Computador Portatil.");
            int opt;
            opt = valid.ValidarEnteroRngsubmenuIng2(sc);
            if (opt == 1) {
                System.out.println("Tablets disponibles.");
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Peso: " + i.getPeso()+".");
                    System.out.println("Almacenamiento: " + i.getAlmacen()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial de la tablet a prestar.");
                String serial=sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Tablet asignada exitosamente.");
                submenuIng();
            } else{
                System.out.println("Computadores disponibles.");
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Procesador: " + i.getProcesador()+".");
                    System.out.println("Sistema operativo: " + i.getSysOp()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial del computador a prestar.");
                String serial = sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Computador asigando exitosamente.");  
                submenuIng();              
            }
        } else{
            System.out.println("Ingrese el serial del estudiante.");
            String ced = sc.next();
            
            modelo.estudiante estudiante = null;

            for (modelo.estudianteDis i : v.vector_disenadores) {
                if (i.getSerialD() == valid.SoloInt(ced)) {
                    estudiante = i;
                    break;
                }
            }

            if (estudiante == null) {
                System.out.println("El estudiante no fue encontrado");    
                submenuIng();            
            }

            System.out.println("Que tipo de equipo desea prestar?.");
            System.out.println("1. Tablet.");
            System.out.println("2. Computador Portatil.");
            int opt;
            opt = valid.ValidarEnteroRngsubmenuIng2(sc);
            if (opt == 1) {
                System.out.println("Tablets disponibles.");
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Peso: " + i.getPeso()+".");
                    System.out.println("Almacenamiento: " + i.getAlmacen()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial de la tablet a prestar.");
                String serial = sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.tablet i : v.vector_tableta) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Tablet asignada exitosamente.");
                submenuIng();
            } else{
                System.out.println("Computadores disponibles.");
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.isPrestado() == false) {
                    System.out.println("Serial: " + i.getSerial()+".");
                    System.out.println("Marca: " + i.getMarca()+".");
                    System.out.println("Tamaño: " + i.getTamaño()+".");
                    System.out.println("Precio: " + i.getPrecio()+".");
                    System.out.println("Procesador: " + i.getProcesador()+".");
                    System.out.println("Sistema operativo: " + i.getSysOp()+".");
                    System.out.println("---------------------");
                    }
                }
                System.out.println("Ingrese el serial del computador a prestar.");
                String serial= sc.next();
                serial = valid.SoloNumstr(serial);
                for (modelo.portatil i : v.vector_portatil) {
                    if (i.getSerial().equals(serial)) {
                        estudiante.setEquipoPrestado("Activo");
                        i.setPrestado(true);
                        break;
                    }
                }
                System.out.println("Computador asigando exitosamente.");  
                submenuIng();              
            }
        } 
   }
   public void Inventario(){
    int opt;
    boolean band= true;
    while (band) {
    System.out.println("Inventario");
    System.out.println("1. Ingenieria.");
    System.out.println("2. Diseño.");
    System.out.println("3. Tablets.");
    System.out.println("4. Portatiles.");
    opt = valid.ValidarEnteroRngprinc(sc);
    switch (opt) {
        case 1 -> {
            System.out.println("Estudiantes de ingenieria");
            System.out.println("Cantidad: "+ v.vector_ingenieros.size());
            for (modelo.estudianteIng i : v.vector_ingenieros) {
                System.out.println("---------------------");
                System.out.println("Nombre: "+i.getNombre()+".");
                System.out.println("Apellido: "+i.getApellido()+".");
                System.out.println("Cedula: "+i.getCedula()+".");
                System.out.println("Telefono: "+i.getTelefono()+".");
                System.out.println("Nro de semestre: "+i.getNroSemestre()+".");
                System.out.println("Promedio acumulado: "+i.getPromAcum()+".");
                System.out.println("Serial: "+i.getSerialI()+".");
                System.out.println("Estado de prestamo de equipos:" + i.getEquipoPrestado()+".");
                System.out.println("---------------------");
            }
        }
        case 2 -> {
            System.out.println("Estudiantes de Diseño");
            System.out.println("Canitdad"+ v.vector_disenadores.size());
            for (modelo.estudianteDis i : v.vector_disenadores) {
                System.out.println("---------------------");
                System.out.println("Nombre: "+i.getNombre()+".");
                System.out.println("Apellido: "+i.getApellido()+".");
                System.out.println("Cedula: "+i.getCedula()+".");
                System.out.println("Telefono: "+i.getTelefono()+".");
                System.out.println("Modalidad: "+i.getModalidad()+".");
                System.out.println("Cantidad de materias: "+i.getCantidadMa()+".");
                System.out.println("Serial: "+i.getSerialD()+".");
                System.out.println("Estado de prestamo de equipos:" + i.getEquipoPrestado()+".");
                System.out.println("---------------------");
            }
        }
        case 3 -> {
            System.out.println("Tablets");
            System.out.println("Cantidad: "+ v.vector_tableta.size());
            for (modelo.tablet i : v.vector_tableta) {
                System.out.println("---------------------");
                System.out.println("Serial: " + i.getSerial()+".");
                System.out.println("Marca: " + i.getMarca()+".");
                System.out.println("Tamaño: " + i.getTamaño()+".");
                System.out.println("Precio: " + i.getPrecio()+".");
                System.out.println("Peso: " + i.getPeso()+".");
                System.out.println("Almacenamiento: " + i.getAlmacen()+".");
                System.out.println("Estado del equipo: " + i.isPrestado()+".");
                System.out.println("---------------------");
            }
        }
        case 4 -> {
            System.out.println("Portatiles");
            System.out.println("Cantidad: "+v.vector_portatil.size());
            for (modelo.portatil i : v.vector_portatil) {
                System.out.println("---------------------");
                System.out.println("Serial: " + i.getSerial()+".");
                System.out.println("Marca: " + i.getMarca()+".");
                System.out.println("Tamaño: " + i.getTamaño()+".");
                System.out.println("Precio: " + i.getPrecio()+".");
                System.out.println("Procesador: " + i.getProcesador()+".");
                System.out.println("Sistema operativo: " + i.getSysOp()+".");
                System.out.println("Estado del equipo: " + i.isPrestado()+".");
                System.out.println("---------------------");
            }
        }
    }
    System.out.println("Desea seguir en el Inventario?");
    System.out.println("1.Si  2.No");
    int br;
    br = valid.ValidarEnteroRngProc(sc);
    if (br == 2) {
        band = false;
    }
    }
   }
}
