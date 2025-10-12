/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ejer3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */

/*
agregarCurso(Curso c) → Agrega el curso a su lista si no está y sincroniza
el lado del curso.
• eliminarCurso(Curso c) → Quita el curso y sincroniza el lado del curso
(dejar profesor en null si corresponde).
• listarCursos() → Muestra códigos y nombres.
• mostrarInfo() → Imprime datos del profesor y cantidad de cursos

*/
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }
    
    public void agregarCurso(Curso curso){
        if(curso == null) return;
        if (!cursos.contains(curso)){
            cursos.add(curso);
            if(curso.getProfesor() != this)
                curso.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso curso){
        if (curso == null) return;
        if(cursos.remove(curso))
        {
            if(curso.getProfesor() == this)
                curso.setProfesor(null);
        }
    }
    
    public void mostrarCursos(){
        if (cursos.isEmpty()){
            System.out.println("No tiene ningun curso asignado");
        }
        else {
            System.out.println("=== LISTADO DE CURSOS ===");
            for (Curso curso : cursos) {
                System.out.println("Codigo: " + curso.getCodigo() + "Nombre: " + curso.getNombre());
            }
            System.out.println("Total de cursos: " + cursos.size());
            System.out.println("=========================");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("=== INFORMACION ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Total de cursos: " + this.cursos.size());
        System.out.println("===================");
    }
}
