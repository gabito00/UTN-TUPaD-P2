/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ejer2;

/**
 *
 * @author Gabriel
 */

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
    
    public void mostrarInfo(){
        System.out.println("=== INFO DEL LIBRO ===");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Año de publicacion: " + this.anioPublicacion);
        System.out.println("Autor: " + this.autor.getNombre());
        System.out.println("======================");
    }
}
