/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6ejer1;

import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // =========================================================================
        // INICIALIZACIÓN DEL SISTEMA DE INVENTARIO
        // =========================================================================
        
        // Crear una instancia del inventario (gestor principal del sistema)
        Inventario inventario = new Inventario();

        // =========================================================================
        // 1) CREACIÓN Y REGISTRO DE PRODUCTOS EN EL INVENTARIO
        // =========================================================================
        
        // Crear 8 productos de diferentes categorías con sus atributos:
        // (ID, Descripción, Precio, Stock, Categoría)
        Producto p1 = new Producto("A001", "Leche entera 1L", 1200.0, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E101", "Auriculares BT", 8500.0, 12, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R210", "Remera lisa", 2800.0, 45, CategoriaProducto.ROPA);
        Producto p4 = new Producto("R211", "Remera estampada", 3100.0, 45, CategoriaProducto.ROPA);
        Producto p5 = new Producto("H330", "Toallon", 7200.0, 20, CategoriaProducto.HOGAR);
        Producto p6 = new Producto("H331", "Toalla", 6200.0, 10, CategoriaProducto.HOGAR);
        Producto p7 = new Producto("A050", "Yerba 1kg", 3500.0, 18, CategoriaProducto.ALIMENTOS);
        Producto p8 = new Producto("E155", "Mouse optico", 2900.0, 60, CategoriaProducto.ELECTRONICA);

        // Agregar todos los productos al inventario
        // El método agregarProducto valida que no existan IDs duplicados
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);
        inventario.agregarProducto(p8);

        // =========================================================================
        // 2) LISTADO COMPLETO DE PRODUCTOS EN INVENTARIO
        // =========================================================================
        
        System.out.println("=== LISTADO COMPLETO DE PRODUCTOS ===");
        inventario.listarProductos();
        System.out.println("=====================================\n");

        // =========================================================================
        // 3) BÚSQUEDA ESPECÍFICA DE PRODUCTO POR ID
        // =========================================================================
        
        System.out.println("=== BUSQUEDA DE PRODUCTO POR ID: R210 ===");
        Producto buscado = inventario.buscarProductoPorId("R210");
        if (buscado != null) {
            buscado.mostrarInfo(); 
        } else {
            System.out.println("No se encontro el producto");
        }
        System.out.println("=========================================\n");

        // =========================================================================
        // 4) FILTRADO DE PRODUCTOS POR CATEGORÍA (ELECTRÓNICA)
        // =========================================================================
        
        System.out.println("=== PRODUCTOS DE CATEGORIA ELECTRONICA ===");
        List<Producto> electronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        electronica.forEach(Producto::mostrarInfo);
        System.out.println("==========================================\n");

        // =========================================================================
        // 5) ELIMINACIÓN DE PRODUCTO DEL INVENTARIO
        // =========================================================================
        
        System.out.println("=== ELIMINACION DE PRODUCTO ID: A001 ===");
        boolean eliminado = inventario.eliminarProducto("A001");
        System.out.println(eliminado ? "Eliminado OK" : "No se encontro el ID");
        
        System.out.println("\n=== INVENTARIO ACTUALIZADO (SIN A001) ===");
        inventario.listarProductos();
        System.out.println("==========================================\n");

        // =========================================================================
        // 6) ACTUALIZACIÓN DE STOCK DE UN PRODUCTO EXISTENTE
        // =========================================================================
        
        System.out.println("=== ACTUALIZACION DE STOCK - PRODUCTO E155 ===");
        boolean actualizado = inventario.actualizarStock("E155", 80);
        System.out.println(actualizado ? "Stock actualizado" : "No se encontro el ID o la cantidad es invalida");
        
        // Verificar la actualización mostrando el producto modificado
        Producto e155 = inventario.buscarProductoPorId("E155");
        if (e155 != null) {
            System.out.print("Producto actualizado: ");
            e155.mostrarInfo();
        }
        System.out.println("==============================================\n");
        
        // =========================================================================
        // 7) CÁLCULO DEL TOTAL DE STOCK DISPONIBLE EN EL INVENTARIO
        // =========================================================================
        
        System.out.println("=== TOTAL DE UNIDADES EN INVENTARIO ===");
        System.out.println("Total de unidades: " + inventario.obtenerTotalStock());
        System.out.println("=======================================\n");

        // =========================================================================
        // 8) IDENTIFICACIÓN DEL PRODUCTO CON MAYOR STOCK
        // =========================================================================
        
        System.out.println("=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            mayor.mostrarInfo();
        } else {
            System.out.println("No hay productos en el inventario");
        }
        System.out.println("================================\n");

        // =========================================================================
        // 9) FILTRADO DE PRODUCTOS POR RANGO DE PRECIO ($1000 - $3000)
        // =========================================================================
        
        System.out.println("=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        List<Producto> rango = inventario.filtrarProductosPorPrecio(1000, 3000);
        if (rango.isEmpty()) {
            System.out.println("No hay productos en ese rango.");
        } else {
            rango.forEach(Producto::mostrarInfo);
        }
        System.out.println("=====================================\n");

        // =========================================================================
        // 10) MUESTRA DE CATEGORÍAS DISPONIBLES EN EL SISTEMA
        // =========================================================================
        
        System.out.println("=== CATEGORIAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
        System.out.println("==============================\n");
    }
    
}