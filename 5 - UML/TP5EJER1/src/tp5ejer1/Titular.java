/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer1;

/**
 *
 * @author Gabriel
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if(pasaporte!=null && pasaporte.getTitular()!=this){
            pasaporte.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public Pasaporte getPasaporte(){
        return this.pasaporte;
    }
    
    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }

}
