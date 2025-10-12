/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer8;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class FirmaDigital {
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    public String getCodigoHash() {
        return codigoHash;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
public String toString() {
    String hash  = (getCodigoHash() != null && !getCodigoHash().isEmpty()) ? getCodigoHash() : "-";
    String fecha = (getFecha() != null) ? getFecha().toString() : "-";

    String usuarioStr;
    if (getUsuario() == null) {
        usuarioStr = "(sin usuario)";
    } else {
        String nombre = (getUsuario().getNombre() != null && !getUsuario().getNombre().isEmpty())
                ? getUsuario().getNombre() : "-";
        String email  = (getUsuario().getEmail() != null && !getUsuario().getEmail().isEmpty())
                ? getUsuario().getEmail() : "-";
        usuarioStr = nombre + " <" + email + ">";
    }

    return "FirmaDigital{hash='" + hash + "', fecha=" + fecha + ", usuario=" + usuarioStr + "}";
}
}
