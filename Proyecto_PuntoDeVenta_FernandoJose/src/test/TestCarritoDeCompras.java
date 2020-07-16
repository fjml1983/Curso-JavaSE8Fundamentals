/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Articulo;
import domain.CarritoDeCompras;
import domain.Cliente;
import domain.Tienda;

/**
 *
 * @author FJML1983
 */
public class TestCarritoDeCompras {
    public static void main(String[] args) {
                
        CarritoDeCompras cc = new CarritoDeCompras();
        
        Articulo a1 = new Articulo(1, "Coca-Cola 250 ml", 12.00, 0);
        Articulo a2 = new Articulo(1, "Coca-Cola 750 ml", 17.00, 0);
        Articulo a3 = new Articulo(1, "Coca-Cola 1500 ml", 23.00, 0);        
        Articulo a4 = new Articulo(1, "Coca-Cola 2500 ml", 35.00, 0);        
        
        Articulo[] articulos = {a1,a2,a3,a4};
        
        for (Articulo aa : articulos) {
            cc.agregarArticulo(aa);
        }
        cc.display();
    }
}
