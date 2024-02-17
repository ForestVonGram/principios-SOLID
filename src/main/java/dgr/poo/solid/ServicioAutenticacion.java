package dgr.poo.solid;

//Principio de sustitución de Liskov

public class ServicioAutenticacion {
    private Autenticador autenticador;
    private Etiquetado etiquetado;

    public ServicioAutenticacion(Autenticador autenticador, Etiquetado etiquetado) {
        this.autenticador = autenticador;
        this.etiquetado = etiquetado;
    }
    public boolean autenticarProducto(Producto producto) {
        boolean isAutenticado = autenticador.autenticar(producto);
        if(isAutenticado) {
            etiquetado.etiquetarProducto(producto);

        }
        return isAutenticado;
    }
}
