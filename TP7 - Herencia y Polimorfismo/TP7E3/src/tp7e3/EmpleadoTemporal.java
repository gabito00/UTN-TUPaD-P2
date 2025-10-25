/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7e3;

/**
 *
 * @author Gabriel
 */
public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(double horasTrabajadas, double tarifaPorHora, String nombre, String id) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
}
