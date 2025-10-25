/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7e3;

/**
 *
 * @author Gabriel
 */
abstract class Empleado {
    protected String nombre;
    protected String id;
    
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public abstract double calcularSueldo();
}
