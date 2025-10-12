/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer11;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // === Crear Artistas ===
        Artista a1 = new Artista("Gustavo Cerati", "Rock");
        Artista a2 = new Artista("Mercedes Sosa", "Folklore");

        // === Crear Canciones ===
        Cancion c1 = new Cancion("Crimen", a1);
        Cancion c2 = new Cancion("Alfonsina y el mar", a2);

        // === Reproductor ===
        Reproductor rep = new Reproductor();

        System.out.println("=== Estado inicial ===");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(rep);

        c2.setArtista(a1);

        // Actualizar datos de artistas
        a1.setGenero("Rock/Pop");
        a2.setNombre("Haydée Mercedes Sosa");

        // Cambiar título de c1
        c1.setTitulo("Crimen (Remaster)");

        System.out.println("\n=== Después de cambios con getters/setters ===");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(c1);
        System.out.println(c2);

        // Reproducir
        System.out.println("\n=== Reproduciendo ===");
        rep.reproducir(c1);
        rep.reproducir(c2);
    }
    
}
