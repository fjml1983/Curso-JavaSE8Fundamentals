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
public class TestTienda {
    public static void main(String[] args) {
        
        Tienda tt = new Tienda(1, "Montecitos Nu. 9", "66-666-666", "GTO901010ES8", "Mi Tiendita");
       
        Cliente c1 = new Cliente(1, "Lucy", "Moctezuma No. 40", "EMAIL600714");
        Cliente c2 = new Cliente(2, "Leticia", "Nezahualcoyotl No. 40", "EMAIL600714");
        Cliente c3 = new Cliente(3, "Laura", "Cuatitlicue No. 40", "EMAIL600714");
        Cliente c4 = new Cliente(4, "Cocoletzi", "Olico No. 666", "EMAIL600714");
        
        Cliente[] clientes = {c1,c2,c3,c4};
        
        for (Cliente cc: clientes) {
            tt.agregarCliente(cc);
        }        
        tt.display();        
        
    }
}
