/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer11;

/**
 *
 * @author Gabriel
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString() {
        String t = (getTitulo() != null && !getTitulo().isEmpty()) ? getTitulo() : "-";
        String artistaStr;
        if (getArtista() == null) {
            artistaStr = "(sin artista)";
        } else {
            String n = (getArtista().getNombre() != null && !getArtista().getNombre().isEmpty())
                    ? getArtista().getNombre() : "-";
            String g = (getArtista().getGenero() != null && !getArtista().getGenero().isEmpty())
                    ? getArtista().getGenero() : "-";
            artistaStr = n + " [" + g + "]";
        }
        return "Cancion{titulo='" + t + "', artista=" + artistaStr + "}";
    }

}
