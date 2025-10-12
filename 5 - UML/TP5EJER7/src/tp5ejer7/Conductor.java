/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer7;

/**
 *
 * @author Gabriel
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    
    public Conductor(String nombre, String licencia){
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    @Override
public String toString() {
    String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
    String lic = (getLicencia() != null && !getLicencia().isEmpty()) ? getLicencia() : "-";
    // Importante: NO incluimos el vehículo para evitar recursión con Vehiculo.toString()
    return "Conductor: " + n + " (Lic " + lic + ")";
}

}
