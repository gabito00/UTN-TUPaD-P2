/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer7;

/**
 *
 * @author Gabriel
 */
public class Motor {
    private String tipo;
    private String numeroSerie;
    
    public Motor(String tipo, String numeroSerie){
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    @Override
public String toString() {
    String t = (getTipo() != null && !getTipo().isEmpty()) ? getTipo() : "-";
    String ns = (getNumeroSerie() != null && !getNumeroSerie().isEmpty()) ? getNumeroSerie() : "-";
    return "Motor: " + t + " [" + ns + "]";
}

}
