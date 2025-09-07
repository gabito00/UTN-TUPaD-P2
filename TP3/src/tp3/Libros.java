/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.time.Year;

/**
 *
 * Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.

 * @author Gabriel
 */
public class Libros {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Getters
     */
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    /**
     * Setters
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo; }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anio) {
        if (anio > 1900 && anio <= Year.now().getValue()){
            this.anioPublicacion = anio;
        }   
    }
    
    public void showData(){
        System.out.printf("Libro: %s\nAutor: %s\nAño de publicacion: %d\n", titulo, autor, anioPublicacion);
    }
    
}
