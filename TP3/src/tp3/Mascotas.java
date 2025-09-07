/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * 2. Registro de Mascotas
 * a. Crear una clase Mascota con los atributos: nombre, especie, edad.
 * Métodos requeridos: mostrarInfo(), cumplirAnios().
 * Tarea: Crear una mascota, mostrar su información, simular el paso del
 * tiempo y verificar los cambios.
 * @author Gabriel
 */
public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascotas() {
     nombre = "Quien";
     especie = "perro";
     edad = 3;
    }

    public void mostrarInfo() {
     System.out.printf("Nombre: %s\nEspecie: %s\nEdad: %d\n", nombre, especie, edad);
    }

    public void cumplirAnios() {
     edad++;
    }

}
