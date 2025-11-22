public class vista {
    public static void main(String[] args) {
        controlador c = new controlador();
        vectores v = new vectores();
        v.LlenadoVectores();
        c.v =v;
        c.principal();
    }
}
