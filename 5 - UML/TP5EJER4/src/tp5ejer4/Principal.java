/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer4;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1) Crear entidades base
        Banco nacion = new Banco("Banco Nación", "30-99999999-9");
        Banco galicia = new Banco("Banco Galicia", "30-11111111-1");

        Cliente maria = new Cliente("María López", "11223344");
        Cliente juan  = new Cliente("Juan Pérez", "22334455");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", nacion);

        // 2) Vincular tarjeta a la clienta María
        maria.setTarjetaDeCredito(tarjeta); // (asumimos que esto también setea el cliente dentro de Tarjeta)

        System.out.println("===== ESTADO INICIAL =====");

        // 3) Cambiar el banco emisor de la tarjeta
        tarjeta.setBanco(galicia);
        System.out.println("\n===== CAMBIO DE BANCO =====");
        System.out.println("Banco anterior: Banco Nación -> Nuevo banco: " + tarjeta.getBanco().getNombre());

        // 4) Reasignar la tarjeta a otro cliente (Juan)
        //    Quitamos la tarjeta de María y se la damos a Juan
        maria.setTarjetaDeCredito(null);
        juan.setTarjetaDeCredito(tarjeta);

        System.out.println("\n===== REASIGNACIÓN DE TITULAR =====");
        System.out.println("Ahora la tarjeta pertenece a: " + tarjeta.getCliente().getNombre());

        // 5) Actualizar la fecha de vencimiento
        tarjeta.setFechaVencimiento("01/31");
        System.out.println("\n===== ACTUALIZACIÓN DE VENCIMIENTO =====");
        System.out.println("Nuevo vencimiento: " + tarjeta.getFechaVencimiento());

        // 6) Crear otra tarjeta para María y mostrar ambas
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito("5555-6666-7777-8888", "05/29", nacion);
        maria.setTarjetaDeCredito(tarjeta2);

        System.out.println("\n===== SEGUNDA TARJETA PARA MARÍA =====");
        System.out.println("Titular (tarjeta2): " + tarjeta2.getCliente().getNombre());


        // 7) Resumen final
        System.out.println("\n===== RESUMEN FINAL =====");
        System.out.println("Cliente: " + maria.getNombre() + " | Tarjeta: " + maria.getTarjetaDeCredito());
        System.out.println("Cliente: " + juan.getNombre()  + " | Tarjeta: " + juan.getTarjetaDeCredito());
        
        System.out.println(juan.toString());
 
    }
    
}
