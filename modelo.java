public class modelo{
    public class estudiante{
        private String cedula;
        private String nombre;                                    
        private String apellido;
        private String telefono;

        public estudiante() {
        }

        


        public String getCedula() {
            return cedula;
        }
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public String getTelefono() {
            return telefono;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }


    public class estudianteIng extends estudiante{
        private int NroSemestre;
        private Float PromAcum;
        private String SerialI;

        public estudianteIng() {
        }

       
                
        public int getNroSemestre() {
            return NroSemestre;
        }
        public void setNroSemestre(int nroSemestre) {
            NroSemestre = nroSemestre;
        }
        public Float getPromAcum() {
            return PromAcum;
        }
        public void setPromAcum(Float promAcum) {
            PromAcum = promAcum;
        }
        public String getSerialI() {
            return SerialI;
        }
        public void setSerialI(String serialI) {
            SerialI = serialI;
        }
    }


    public class estudianteDis extends estudiante{
        private int CantidadMa;
        private String Modalidad;
        private int SerialD;

        public estudianteDis() {
        }

        

        public int getCantidadMa() {
            return CantidadMa;
        }

        public void setCantidadMa(int cantidadMa) {
            CantidadMa = cantidadMa;
        }

        public String getModalidad() {
            return Modalidad;
        }

        public void setModalidad(String modalidad) {
            Modalidad = modalidad;
        }

        public int getSerialD() {
            return SerialD;
        }

        public void setSerialD(int serialD) {
            SerialD = serialD;
        }
    }
    public class equipo_electr{
        private String Serial;
        private String Marca;
        private Float Tamaño;
        private Float Precio;

        public equipo_electr() {
        }

       

        public String getSerial() {
            return Serial;
        }

        public void setSerial(String serial) {
            Serial = serial;
        }

        public String getMarca() {
            return Marca;
        }

        public void setMarca(String marca) {
            Marca = marca;
        }

        public Float getTamaño() {
            return Tamaño;
        }

        public void setTamaño(Float tamaño) {
            Tamaño = tamaño;
        }

        public Float getPrecio() {
            return Precio;
        }

        public void setPrecio(Float precio) {
            Precio = precio;
        }
    }
    public class tablet extends equipo_electr{
        private Float peso;
        private int Almacen;

        public tablet() {
        }
       
        public Float getPeso() {
            return peso;
        }
        public void setPeso(Float peso) {
            this.peso = peso;
        }
        public int getAlmacen() {
            return Almacen;
        }
        public void setAlmacen(int almacen) {
            Almacen = almacen;
        }
    }
    public class portatil extends equipo_electr{
        private String Procesador;
        private String sysOp;
        public portatil() {
        }

        
        public String getProcesador() {
            return Procesador;
        }

        public void setProcesador(String procesador) {
            Procesador = procesador;
        }

        public String getSysOp() {
            return sysOp;
        }

        public void setSysOp(String sysOp) {
            this.sysOp = sysOp;
        }
        
    }
}