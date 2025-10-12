/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Inventario {
    private List<Producto> productos = new ArrayList<>();
    
    // Agrega un producto si no existe otro con el mismo ID
    public boolean agregarProducto(Producto p) {
        if (p == null || buscarProductoPorId(p.getId()) != null)
            return false;
        return this.productos.add(p);
    }

    // Lista todos los productos
    public void listarProductos() {
        if (this.productos.isEmpty())
            System.out.println("No hay productos en el inventario.");
        else
            productos.forEach(Producto::mostrarInfo);
    }


    // Busca por ID (retorna null si no existe)
    public Producto buscarProductoPorId(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equalsIgnoreCase(id)) {
            return p;
            }
        }
        return null;
    }
    
    // Elimina por ID (retorna true si se eliminó)
    public boolean eliminarProducto(String id) {
        Iterator<Producto> it = this.productos.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equalsIgnoreCase(id)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if(p == null || nuevaCantidad < 0) 
            return false;
        p.setCantidad(nuevaCantidad);
        return true;
    }
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoriaProducto){
        List<Producto> listaProductos = new ArrayList<>();
        for(Producto p: this.productos){
            if (p.getCategoria() == categoriaProducto)
                listaProductos.add(p);
        }
        return listaProductos;
    }
    
    public int obtenerTotalStock(){
        int total = 0;
        for (Producto producto : this.productos) {
            total += producto.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock(){
        if (this.productos == null) return null;
        Producto producto = null;
        int aux=0;
        for (Producto p : this.productos) {
            if (p.getCantidad() > aux)
            {
                producto = p;
                aux = p.getCantidad();
            }
        }
        return producto;
    }
    
    public List<Producto> filtrarProductosPorPrecio(double min, double max){
        List<Producto> productos = new LinkedList<>();
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) 
                productos.add(p);
        }
        return productos;
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + " → " + c.getDescripcion());
        }
    }
}
