/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logic;

import gui.Pantalla;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author facun
 */
public class PracticaExamenLibre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList();
        
        //int codigoProducto, String marca, String descripcion, float costo, int porc_ganancia
        Producto ejem1 = new Producto(1,"Microsoft", "Windows 10", 150, 50);
        Producto ejem2 = new Producto(2,"Linux", "Kali", 70, 30);
        productos.add(ejem1);
        productos.add(ejem2);
        
        //Iniciar pantalla principal
        Pantalla pp = new Pantalla(productos);
        pp.setVisible(true);
        pp.setLocationRelativeTo(null);
        
    }
    
}
