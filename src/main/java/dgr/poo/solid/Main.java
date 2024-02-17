package dgr.poo.solid;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Plátano", "453201", "1000");

        Autenticador autenticador = new CredencialAutenticador();
        Etiquetado etiquetado = new EtiquetadorRojoProducto();
        ServicioAutenticacion servicioAuth = new ServicioAutenticacion(autenticador, etiquetado);
        boolean isAutenticado = servicioAuth.autenticarProducto(producto);
        if (isAutenticado) {
            System.out.println("El producto se ha verificado/autenticado.");
        } else {
            System.out.println("La autenticación falló.");
        }
    }
}
