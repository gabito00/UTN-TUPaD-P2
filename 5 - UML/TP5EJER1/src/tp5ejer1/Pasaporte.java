/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer1;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Pasaporte {
    private final String numero;
    private final LocalDate fechaEmision;
    private Titular titular;
    private Foto foto;
    
    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato ){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this)
            titular.setPasaporte(this);
    }
    
    public Titular getTitular(){
        return this.titular;
    }

    public LocalDate getFechaDeEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public String getNumero() {
        return numero;
    }    
    @Override
    public String toString() {
        return "Pasaporte{" +
               "numero='" + numero + '\'' +
               ", fechaDeEmision=" + fechaEmision +
               ", titular=" + (titular != null ? titular.getNombre() : "(sin titular)") +
               ", foto=" + foto +
               '}';
    }

}
