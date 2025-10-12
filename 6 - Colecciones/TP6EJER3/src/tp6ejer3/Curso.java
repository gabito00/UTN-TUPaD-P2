/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ejer3;

/**
 *
 * @author Gabriel
 */

/*
this.
*/
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void setProfesor(Profesor profesor){
        if (this.profesor == profesor) return ;
        if (profesor != null){
            this.profesor = profesor;
            profesor.eliminarCurso(this);
        }
    }
    
    public void mostrarInfo(){
        System.out.println("\n=== INFORMACION DEL CURSO ===");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Profesor: "  + (this.profesor != null ? this.profesor.getNombre() : "-"));
        System.out.println("=============================");
    }

}
