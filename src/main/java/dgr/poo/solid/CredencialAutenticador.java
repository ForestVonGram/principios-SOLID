package dgr.poo.solid;

//Principio abierto/cerrado

public class CredencialAutenticador implements Autenticador {
    public boolean autenticar(Producto producto) {
        return true;
    }
}
