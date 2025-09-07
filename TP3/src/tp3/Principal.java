/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            
            switch(opcion) {
                case 1:
                    gestionarEstudiantes();
                    break;
                case 2:
                    gestionarMascotas();
                    break;
                case 3:
                    gestionarLibros();
                    break;
                case 4:
                    gestionarGallinas();
                    break;
                case 5:
                    gestionarNaveEspacial();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
            if (opcion != 0) {
                System.out.println("\nPresione Enter para continuar...");
                sc.nextLine();
            }
            
        } while (opcion != 0);
    }
    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Gestionar Estudiantes");
        System.out.println("2. Gestionar Mascotas");
        System.out.println("3. Gestionar Libros");
        System.out.println("4. Gestionar Gallinas");
        System.out.println("5. Gestionar Nave Espacial");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    private static void gestionarEstudiantes() {
        Estudiantes e = new Estudiantes();
        e.mostrarInfo();
        e.subirCalificacion(2.5);
        e.mostrarInfo();
        e.bajarCalificacion(0.5);
        e.mostrarInfo();

    }
    private static void gestionarMascotas() {
        Mascotas m = new Mascotas();
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
    }
    
    private static void gestionarLibros() {
        Libros l = new Libros();
        System.out.println(Year.now().getValue());
        l.setTitulo("Clean Code");
        l.setAutor("Robert C. Martin");
        l.setAnioPublicacion(2008);
        l.showData();
        l.setAnioPublicacion(2055);
        l.showData();
    }
    
    private static void gestionarGallinas() {
        Gallinas ga1 = new Gallinas();
        Gallinas ga2 = new Gallinas();
        
        ga1.envejecer();
        ga2.ponerHuevo();
        ga1.mostarEstado();
        ga2.mostarEstado();
    }
    
    private static void gestionarNaveEspacial() {
        NaveEspacial ne = new NaveEspacial();
        ne.despegar();
        ne.avanzar(50);
        ne.recargarCombustible(100);
        ne.avanzar(50);
        ne.mostrarEstado();
    }
}