/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commerce;

/**
 *
 * @author Gabriel
 */
public class ECommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE E-COMMERCE ===");
        
        // Crear cliente
        Cliente cliente = new Cliente("Juan Maria Traverso", "juan@email.com");
        
        // Crear productos
        Producto producto1 = new Producto("Cigueñal", 1500.0);
        Producto producto2 = new Producto("Cubierta", 25.0);
        Producto producto3 = new Producto("Optica", 75.0);
        
        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("Productos en el pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println(" - " + p);
        }
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        
        // Probar notificaciones
        System.out.println("\n--- Cambios de Estado ---");
        pedido.cambiarEstado("CONFIRMADO");
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
        
        // Probar métodos de pago
        System.out.println("\n--- Procesamiento de Pagos ---");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Pérez");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);
        
        PayPal paypal = new PayPal("juan@traverso.com");
        paypal.procesarPago(pedido.calcularTotal());
    }
    
}
