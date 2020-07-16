package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CarritoDeCompras {
    private Articulo[] articulos;
    private static int MAX_ARTICULOS = 1000;    

    public CarritoDeCompras() {
        articulos = new Articulo[MAX_ARTICULOS];
    }
    
    
    
     public void agregarArticulo(Articulo articulo){
        for (int i = 0; i < MAX_ARTICULOS; i++) {
            if(articulos[i] == null){
                articulos[i] = articulo;
                break;
            }
        }
    }
        
    public void eliminarArticulo(Articulo articulo){
        for (int i = 0; i < MAX_ARTICULOS; i++) {
            if(articulos[i].getCodigo() == articulo.getCodigo()){
                articulos[i] = null;
                break;
            }
        }        
    }
    
      public void display(){
        System.out.println(".......DATOS DEL CARRITO.......");

        System.out.println("Total: " + 
                Arrays.stream(articulos)
                .filter(a -> a != null)
                .mapToDouble(a -> a.getPrecio()).sum());
        
        System.out.println("Articulos: "); 
        char separador = '║';        
        Arrays.stream(articulos)
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
