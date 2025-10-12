/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer9;

/**
 *
 * @author Gabriel
 */
public class Profesional {
    private String nombre;
    private String especialidad;
    
    public Profesional(String nombre, String especialidad){
        this.especialidad = especialidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
public String toString() {
    String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
    String esp = (getEspecialidad() != null && !getEspecialidad().isEmpty()) ? getEspecialidad() : "-";
    return "Profesional{nombre='" + n + "', especialidad='" + esp + "'}";
}

}
