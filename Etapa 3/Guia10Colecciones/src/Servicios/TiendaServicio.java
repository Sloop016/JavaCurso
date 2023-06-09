/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Productos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class TiendaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void agregarProducto(HashMap<String, Double> productos) {

        Productos producto = new Productos();
        System.out.println("Ingrese el nombre del nuevo producto:");
        producto.setNombre(sc.next());
        System.out.println("Ingrese el precio del nuevo producto:");
        producto.setPrecio(sc.nextDouble());
        productos.put(producto.getNombre(), producto.getPrecio());
    }

    public void modificarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto que desea modificar:");
        String nombre = sc.next();
        System.out.println("Ingrese el nuevo precio del producto:");
        Double precio = sc.nextDouble();
        if (productos.containsKey(nombre)) {
            productos.put(nombre, precio);
            System.out.println("El producto ha sido modificado");
        } else {
            System.out.println("El producto no existe!");
        }
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String nombre = sc.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("El producto ha sido eliminado");
        } else {
            System.out.println("El producto no existe!");
        }
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        ArrayList<String> lista = new ArrayList<>(productos.keySet());
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + " " +"$"+ entry.getValue());
        }
    }

    public void promedioProductos(HashMap<String, Double> productos) {
        double suma = 0;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            suma += entry.getValue();
        }
        System.out.println("Los cantidad de productos son: "+ productos.size() +" y el promedio es: "+ "$" + suma / productos.size());
    }
}
