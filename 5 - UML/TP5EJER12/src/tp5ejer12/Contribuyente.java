/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer12;

/**
 *
 * @author Gabriel
 */
public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    @Override
    public String toString() {
        String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
        String c = (getCuil()   != null && !getCuil().isEmpty())   ? getCuil()   : "-";
        return "Contribuyente{nombre='" + n + "', cuil='" + c + "'}";
    }

}
