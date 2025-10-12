/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer3;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor = new Autor("G. G. Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Calle Falsa 123");
        Libro libro = new Libro("Cien años de soledad", "978-3-16-148410-0", editorial);
        libro.setAutor(autor);

    System.out.println("=== Estado ===");
    System.out.println(libro);     // usa Libro.toString()
    System.out.println(autor);     // usa Autor.toString()
    System.out.println(editorial); // usa Editorial.toString();
    }
    
}
