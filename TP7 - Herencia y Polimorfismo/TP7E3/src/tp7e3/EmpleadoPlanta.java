/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7e3;

/**
 *
 * @author Gabriel
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoMensual;

    public EmpleadoPlanta(double sueldoMensual, String nombre, String id) {
        super(nombre, id);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
    
}
