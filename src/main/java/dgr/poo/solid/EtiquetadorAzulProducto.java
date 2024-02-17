package dgr.poo.solid;

//Principio de segregación de interfaz (ISP)

public class EtiquetadorAzulProducto implements Etiquetado {
    public void etiquetarProducto(Producto producto) {
        System.out.println("Etiquetando el producto código " + producto.getCodigo() + " de nombre " + producto.getNombre() +" con etiqueta Azúl.");
    }
}
