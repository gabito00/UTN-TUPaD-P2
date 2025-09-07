/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * Registro de Estudiantes
 * a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
 * calificación.
 * Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
 * bajarCalificacion(puntos).
 * Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
 * calificaciones.
 * 
 * @author Gabriel
 */
public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double nota;
    
    public Estudiantes(){
        nombre = "Diego";
        apellido = "Maradona";
        curso = "Algebra";
        nota = 6;
    }
    
    public void mostrarInfo(){
        System.out.printf("Nombre: %s\n Apellido: %s\n Curso: %s\n Nota: %.2f\n", nombre, apellido, curso, nota);
    }
    
    public void subirCalificacion(double puntos){
        nota += puntos;
    }
    
    public void bajarCalificacion(double puntos){
        nota -= puntos;
    }
}
