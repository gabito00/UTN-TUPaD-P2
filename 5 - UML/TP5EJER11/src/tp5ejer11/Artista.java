/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer11;

/**
 *
 * @author Gabriel
 */
public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
        String g = (getGenero() != null && !getGenero().isEmpty()) ? getGenero() : "-";
        return "Artista{nombre='" + n + "', genero='" + g + "'}";
    }

}
