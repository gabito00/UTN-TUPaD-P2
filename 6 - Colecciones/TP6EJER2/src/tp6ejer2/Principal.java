/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6ejer2;

import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Principal {
    public static void main(String[] args) {
        // ================================================================
        // 1. CREAR UNA BIBLIOTECA
        // ================================================================
        System.out.println("=== CREACIÓN DE BIBLIOTECA ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());
        
        // ================================================================
        // 2. CREAR AL MENOS TRES AUTORES
        // ================================================================
        System.out.println("\n=== CREACIÓN DE AUTORES ===");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Jorge Luis Borges", "Argentina");
        
        System.out.println("Autores creados exitosamente:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        
        // ================================================================
        // 3. AGREGAR 5 LIBROS ASOCIADOS A LOS AUTORES
        // ================================================================
        System.out.println("\n=== AGREGANDO LIBROS A LA BIBLIOTECA ===");
        biblioteca.agregarLibro("978-8437604947", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-8401337208", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-8401337215", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("978-8478884457", "Eva Luna", 1987, autor2);
        biblioteca.agregarLibro("978-8478887205", "Ficciones", 1944, autor3);
        
        System.out.println("5 libros agregados exitosamente a la biblioteca.");
        
        // ================================================================
        // 4. LISTAR TODOS LOS LIBROS CON SU INFORMACIÓN
        // ================================================================
        biblioteca.listarLibros();
        
        // ================================================================
        // 5. BUSCAR UN LIBRO POR SU ISBN Y MOSTRAR SU INFORMACIÓN
        // ================================================================
        System.out.println("\n=== BÚSQUEDA DE LIBRO POR ISBN ===");
        String isbnBuscado = "978-8437604947";
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(isbnBuscado);
        
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró ningún libro con ISBN: " + isbnBuscado);
        }
        
        // ================================================================
        // 6. FILTRAR Y MOSTRAR LIBROS POR AÑO ESPECÍFICO
        // ================================================================
        System.out.println("\n=== FILTRADO DE LIBROS POR AÑO (1985) ===");
        List<Libro> libros1985 = biblioteca.filtrarLibrosPorAnio(1985);
        
        if (libros1985.isEmpty()) {
            System.out.println("No hay libros publicados en 1985.");
        } else {
            System.out.println("Libros publicados en 1985:");
            for (Libro libro : libros1985) {
                libro.mostrarInfo();
            }
        }
        
        // ================================================================
        // 7. ELIMINAR UN LIBRO POR ISBN Y LISTAR LOS RESTANTES
        // ================================================================
        System.out.println("\n=== ELIMINACIÓN DE LIBRO ===");
        String isbnEliminar = "978-8478884457";
        biblioteca.eliminarLibro(isbnEliminar);
        
        System.out.println("\n=== LISTADO DESPUÉS DE ELIMINACIÓN ===");
        biblioteca.listarLibros();
        
        // ================================================================
        // 8. MOSTRAR CANTIDAD TOTAL DE LIBROS
        // ================================================================
        System.out.println("\n=== CANTIDAD TOTAL DE LIBROS ===");
        System.out.println("La biblioteca tiene " + biblioteca.obtenerCantidadLibros() + " libros.");
        
        // ================================================================
        // 9. LISTAR TODOS LOS AUTORES DISPONIBLES
        // ================================================================
        biblioteca.mostrarAutoresDisponibles();
        
        System.out.println("\n=== SISTEMA DE BIBLIOTECA - EJECUCIÓN COMPLETADA ===");
    }
}
