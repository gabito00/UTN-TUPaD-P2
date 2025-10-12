/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer9;

/**
 *
 * @author Gabriel
 */
public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    
    @Override
public String toString() {
    String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
    String os = (getObraSocial() != null && !getObraSocial().isEmpty()) ? getObraSocial() : "-";
    return "Paciente{nombre='" + n + "', obraSocial='" + os + "'}";
}

}
