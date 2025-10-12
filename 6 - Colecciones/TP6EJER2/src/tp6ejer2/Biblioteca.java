/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ejer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Gabriel
 */

/*
Atributo:
• String nombre
• List<Libro> libros → Colección de libros de la biblioteca
Métodos requeridos:
• agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor)
• listarLibros()
• buscarLibroPorIsbn(String isbn)
• eliminarLibro(String isbn)
• obtenerCantidadLibros()
• filtrarLibrosPorAnio(int anio)
• mostrarAutoresDisponibles()
*/
public class Biblioteca {
    private String nombre;
    private List<Libro> libros; 

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public boolean  agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        if(autor == null)
        {
            System.out.println("No se puede agregar un libro sin autor");
            return false;
        }
        if (buscarLibroPorIsbn(isbn) != null){
            System.out.println("El libro ya se encuentra agregado");
            return false;
        }
        
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(libro);
        return true;
    }
    
    public void listarLibros(){
        System.out.println("==== LISTADO COMPLETO DE LIBROS ====");
        System.out.println("Libreria: " + this.nombre);
        System.out.println("Cantidad de libros: " + this.libros.size());
        System.out.println("====================================");
        
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn))
                return libro;
        }
        return null;
    }
    
    public boolean eliminarLibro(String isbn){
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()){
            Libro libro = it.next();
            if(libro.getIsbn().equals(isbn))
            {
                it.remove();
                System.out.println("Libro eliminado correctamente");
                return true;
            }
        }
        System.out.println("Libro no encontrado.");
        return false;
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio){
        List<Libro> libros = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio)
                libros.add(libro);
        }
        return libros;
    }
    
    public void mostrarAutoresDisponibles() {
        List<Autor> autores = new ArrayList<>();

        for (Libro libro : this.libros) {
            Autor autor = libro.getAutor();

            boolean autorYaExiste = false;
            for (Autor a : autores) {
                if (a.getId().equals(autor.getId())) {
                    autorYaExiste = true;
                    break;
                }
            }

            if (!autorYaExiste) {
                autores.add(autor);
            }
        }

        System.out.println("\n=== AUTORES DISPONIBLES ===");
        System.out.println("Total de autores únicos: " + autores.size());

        if (autores.isEmpty()) {
            System.out.println("No hay autores registrados en la biblioteca.");
        } 
        else 
        {
            for (int i = 0; i < autores.size(); i++) {
                System.out.println("\nAutor #" + (i + 1) + ":");
                autores.get(i).mostrarInfo();
            }
        }
        System.out.println("\n==========================");
    }
}
