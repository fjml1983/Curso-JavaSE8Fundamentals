package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CarritoDeCompras {
    private ArrayList<Articulo> articulos;

    public CarritoDeCompras() {
        articulos = new ArrayList<>();
    }        
    
     public void agregarArticulo(Articulo articulo){
         articulos.add(articulo);
    }
        
    public void eliminarArticulo(Articulo articulo){
        articulos.remove(articulo);
    }
    
      public void display(){
        System.out.println(".......DATOS DEL CARRITO.......");

        System.out.println("Total: " + 
                articulos.stream()
                .filter(a -> a != null)
                .mapToDouble(a -> a.getPrecio()).sum());
        
        System.out.println("Articulos: "); 
        char separador = '║';        
            articulos.stream()
            .filter(a -> a != null)
            .forEach(a -> 
                System.out.println(new StringBuilder("\t")
                                    .append("Codigo: ").append(a.getCodigo()).append(separador)
                                    .append("Descripción: ").append(a.getDescripcion()).append(separador)
                                    .append("Precio: ").append(a.getPrecio())
                                    .toString())
            );
        
        System.out.println("...............................");
    }
}
