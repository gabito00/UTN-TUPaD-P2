/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer2;

/**
 *
 * @author Gabriel
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;
    
    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.bateria = bateria;
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this)
            usuario.setCelular(this);
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    @Override
    public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo + "'" +
               (bateria != null ? ", bateria='" + bateria.getModelo() + " " + bateria.getCapacidad() + "mAh'" : "") +
               (usuario != null ? ", usuario='" + usuario.getNombre() + "'" : ", usuario=(sin usuario)") +
               "}";
    }

    
}
