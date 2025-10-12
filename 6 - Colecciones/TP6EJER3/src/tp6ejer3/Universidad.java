/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ejer3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public boolean agregarProfesor(Profesor p){
        if(p == null) return false;
        return profesores.add(p);
    }
    
    public boolean agregarCurso(Curso c){
        if(c == null) return false;
        return cursos.add(c);
    }
    
    public Profesor buscarProfesorPorId(String id){
        for (Profesor profesor : this.profesores) {
            if(profesor.getId().equalsIgnoreCase(id))
                return profesor;
        }
        return null;
    }
    
    public Curso buscarCursoPorId(String id){
        for (Curso curso : this.cursos) {
            if (curso.getCodigo().equalsIgnoreCase(id))
                return curso;
        }
        return null;
    }
        
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso curso = buscarCursoPorId(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso == null || profesor == null){
            System.out.println("Curso o Profesor no encontrado");
            return false;
        }
        curso.setProfesor(profesor);
        return true;
    }
    
    public void listarProfesores(){
        if (this.profesores.isEmpty())
        {
            System.out.println("No hay profesores registrados.");
        }
        else{
            
            System.out.println("=== LISTADO DE PROFESORES ===");
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
            System.out.println("Cantidad de profesores: " + profesores.size());
            System.out.println("=============================");
        }
    }
    
    public void listarCursos(){
        if (this.cursos.isEmpty()){
            System.out.println("No hay cursos registrados");
        }
        else{
            System.out.println("=== LISTADO DE CURSOS ===");
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
            System.out.println("Total cursos: " + cursos.size());
            System.out.println("=========================");
        }
    }
    
    public boolean eliminarCurso(String codigo){
        Iterator<Curso> iterator = cursos.iterator();
        while(iterator.hasNext()){
            Curso curso = iterator.next();
            if(curso.getCodigo().equalsIgnoreCase(codigo)){
                if(curso.getProfesor() != null){
                    curso.getProfesor().eliminarCurso(curso);
                }
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarProfesor(String id){
        Iterator<Profesor> it = profesores.iterator();
        while (it.hasNext()) {
            Profesor profesor = it.next();
            if(profesor.getId().equalsIgnoreCase(id)){
                for (Curso c : profesor.getCursos()) {
                    c.setProfesor(null);
                }
            }
            it.remove();
            return true;
        }
        return false;
    }
}
