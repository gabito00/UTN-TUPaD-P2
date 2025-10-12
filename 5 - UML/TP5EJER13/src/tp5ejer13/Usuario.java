/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer13;

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
    String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
    String e = (getEmail()  != null && !getEmail().isEmpty())  ? getEmail()  : "-";
    return "Usuario{nombre='" + n + "', email='" + e + "'}";
}

}
