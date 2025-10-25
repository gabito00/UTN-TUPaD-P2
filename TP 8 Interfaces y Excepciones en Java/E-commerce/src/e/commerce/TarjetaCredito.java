/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce;

/**
 *
 * @author Gabriel
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito...");
        System.out.println("Monto: $" + monto);
        // Simulación de procesamiento
        return true;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10; // 10% de descuento
        System.out.println("Descuento aplicado: $" + descuento);
        return monto - descuento;
    }
}
