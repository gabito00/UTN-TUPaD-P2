/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Gabriel
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    private final double SALARIO_POR_DEFECTO = 500;

    public Empleado() {
    }

    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = this.SALARIO_POR_DEFECTO;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }

    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }

    public void setSalario(double salario) { this.salario = salario; }

    public static int getTotalEmpleados() { return totalEmpleados; }
    
    public void actualizarSalario(double monto, boolean esMontoFijo){
        if(esMontoFijo)
            this.salario += monto;
    }
    
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * porcentaje;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
}
