/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer2;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // --- Crear objetos base usando constructores ---
    Usuario usuario = new Usuario("Ana Gomez", "87654321");
    Bateria bateria = new Bateria("BTX-5000", 4000);
    Celular celular = new Celular("123456789012345", "Samsung", "A52", bateria);

    // --- Enlazar Usuario <-> Celular ---
    usuario.setCelular(celular);

    System.out.println("=== Estado inicial ===");
    System.out.println(usuario);   // usa Usuario.toString()
    System.out.println(celular);   // usa Celular.toString()
    System.out.println(bateria);   // usa Bateria.toString()
    System.out.println();

    // --- Ejemplos de valores actuales (si querés mostrar algo puntual) ---
    System.out.println("GETTERS -> Nombre usuario: " + usuario.getNombre()
            + ", Modelo celular: " + celular.getModelo()
            + ", Capacidad: " + bateria.getCapacidad() + " mAh");
    System.out.println();

    // --- Ejemplos de SETTERS ---
    usuario.setNombre("Ana Victoria Gomez");
    celular.setModelo("A52s");
    celular.setMarca("Samsung Galaxy");
    celular.setImei("999000111222333");
    bateria.setCapacidad(4500);
    bateria.setModelo("BTX-5000 Pro");

    System.out.println("=== Despues de setters simples ===");
    System.out.println(usuario);
    System.out.println(celular);
    System.out.println(bateria);
    System.out.println();

    // --- Setters con objetos asociados: reemplazar la batería ---
    Bateria bateriaNueva = new Bateria("UltraCell-X", 5000);
    celular.setBateria(bateriaNueva);

    System.out.println("=== Reemplazo de batería ===");
    System.out.println(celular);          // ya incluye batería y usuario en su toString()
    System.out.println(celular.getBateria());
    System.out.println();

    // --- Demostración de relación bidireccional Usuario <-> Celular ---
    Usuario otroUsuario = new Usuario("Carlos Perez", "22334455");

    // Setear usuario del celular: debe actualizar la otra punta
    celular.setUsuario(otroUsuario);
    System.out.println("=== Cambio del usuario dueño del celular ===");
    System.out.println("Desde Celular: " + celular);
    System.out.println("Desde Usuario: " + otroUsuario);
    System.out.println();

    // ¡Ojo con el orden del constructor! (imei, marca, modelo, bateria)
    Celular nuevoCel = new Celular("555444333222111", "Motorola", "G54",
                                   new Bateria("MotoPower", 4800));
    otroUsuario.setCelular(nuevoCel);

    System.out.println("=== Cambio de celular del usuario (setter bidireccional al revés) ===");
    System.out.println("Usuario -> " + otroUsuario);   // mostrará su celular
    System.out.println("Celular -> " + nuevoCel);      // mostrará su usuario y batería
    System.out.println();

    // --- Lectura final verificada ---
    System.out.println("=== Estado final verificado ===");
    System.out.println(otroUsuario);
    System.out.println(otroUsuario.getCelular());
    System.out.println(otroUsuario.getCelular().getBateria());

    }
    
}
