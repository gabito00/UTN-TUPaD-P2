/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer8;

/**
 *
 * @author Gabriel
 */
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
public String toString() {
    String nombre = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
    String email  = (getEmail()  != null && !getEmail().isEmpty())   ? getEmail()  : "-";
    return "Usuario{nombre='" + nombre + "', email='" + email + "'}";
}

}
