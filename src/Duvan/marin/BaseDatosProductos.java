package Duvan.marin;
import java.util.HashMap;
import java.util.Map;

public class BaseDatosProductos {
    HashMap<Integer,Productos> producto = new HashMap<Integer,Productos>();
    public void  base(){
        producto.put(1,new Productos(1,"Manzana",1,1));
        producto.put(2,new Productos(2,"Limones",2,2));
        producto.put(3,new Productos(3,"peras",3,3));

    }
    public void listar(){
        //     System.out.println("elementos: \n"+producto.toString().replaceAll(",", "\n"));
        for (int i : producto.keySet()) {
            System.out.println("key: " + i + " Descripcion: " + producto.get(i));
        }
    }
    public void agregar(){
        System.out.println("agregar productos");
        producto.put(4,new Productos(4,"zanahorias",4,2));
    }
    public void borrar(){
        producto.remove(4);
    }
    public void actualiza(){
        producto.replace(4,new Productos(6,"fresa",6,6));
    }
}
