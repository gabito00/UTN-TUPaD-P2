/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer14;

/**
 *
 * @author Gabriel
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }
    
    @Override
    public String toString() {
        String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
        String d = String.valueOf(getDuracionMin());
        return "Proyecto{nombre='" + n + "', duracionMin=" + d + "}";
    }

}
