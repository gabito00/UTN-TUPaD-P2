/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer6;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Reserva {
    private LocalDate fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(LocalDate fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    @Override
    public String toString() {
        String nombre = (cliente != null && cliente.getNombre() != null)
                ? cliente.getNombre() : "(sin cliente)";
        String telefono = (cliente != null && cliente.getTelefono() != null)
                ? cliente.getTelefono() : "-";

        String mesaInfo = (mesa != null)
                ? "Mesa " + mesa.getNumero() + " (capacidad " + mesa.getCapacidad() + ")"
                : "(sin mesa)";

        return "- " + fecha + " " + hora
                + " | Cliente: " + nombre + " (Telefono " + telefono + ")"
                + " | " + mesaInfo;
    }

    
}
