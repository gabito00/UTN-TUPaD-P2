/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer10;

/**
 *
 * @author Gabriel
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria != null && cuentaBancaria.getTitular() != this)
            cuentaBancaria.setTitular(this);
    }
    @Override
    public String toString() {
        String n = (getNombre() != null && !getNombre().isEmpty()) ? getNombre() : "-";
        String d = (getDni() != null && !getDni().isEmpty()) ? getDni() : "-";
        String cInfo = (getCuentaBancaria() != null && getCuentaBancaria().getCbu() != null)
                ? getCuentaBancaria().getCbu()
                : "(sin cuenta)";
        return "Titular{nombre='" + n + "', dni='" + d + "', cbu=" + cInfo + "}";
    }

    
}
