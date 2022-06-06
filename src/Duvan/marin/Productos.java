package Duvan.marin;


public class Productos {
    int codigo;
    String nombre;
    int precio;
    int inventario;
    public Productos(int cod, String nom,int pre, int inv){
        this.codigo=cod;
        this.nombre=nom;
        this.precio=pre;
        this.inventario=inv;
    }
    @Override
    public String toString() {
        return "Productos-> codigo: "+codigo+" Nombre: "+nombre + " precio: "+precio+ " inventario: "+inventario;  }
}