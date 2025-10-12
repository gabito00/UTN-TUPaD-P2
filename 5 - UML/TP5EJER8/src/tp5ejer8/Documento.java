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
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(String titulo, String contenido, String codigoHash, LocalDate fecha, Usuario usuario) {
    this.titulo = titulo;
    this.contenido = contenido;
    this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
public String toString() {
    String t = (getTitulo() != null && !getTitulo().isEmpty()) ? getTitulo() : "-";
    String c = (getContenido() != null && !getContenido().isEmpty()) ? getContenido() : "-";

    String firmaStr;
    if (getFirmaDigital() == null) {
        firmaStr = "(sin firma)";
    } else {
        String hash  = (getFirmaDigital().getCodigoHash() != null && !getFirmaDigital().getCodigoHash().isEmpty())
                ? getFirmaDigital().getCodigoHash() : "-";
        String fecha = (getFirmaDigital().getFecha() != null)
                ? getFirmaDigital().getFecha().toString() : "-";
        String usuarioStr;
        if (getFirmaDigital().getUsuario() == null) {
            usuarioStr = "(sin usuario)";
        } else {
            String nombre = (getFirmaDigital().getUsuario().getNombre() != null && !getFirmaDigital().getUsuario().getNombre().isEmpty())
                    ? getFirmaDigital().getUsuario().getNombre() : "-";
            String email  = (getFirmaDigital().getUsuario().getEmail() != null && !getFirmaDigital().getUsuario().getEmail().isEmpty())
                    ? getFirmaDigital().getUsuario().getEmail() : "-";
            usuarioStr = nombre + " <" + email + ">";
        }
        firmaStr = "[hash=" + hash + ", fecha=" + fecha + ", usuario=" + usuarioStr + "]";
    }

    return "Documento{titulo='" + t + "', contenido='" + c + "', firma=" + firmaStr + "}";
}

    
}
