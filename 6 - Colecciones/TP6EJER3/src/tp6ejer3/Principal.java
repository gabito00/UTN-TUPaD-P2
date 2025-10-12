/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6ejer3;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ================================================================
        // 1. CREAR UNIVERSIDAD
        // ================================================================
        System.out.println("=== CREACION DE UNIVERSIDAD ===");
        Universidad universidad = new Universidad("Universidad Nacional");
        
        // ================================================================
        // 1. CREAR AL MENOS 3 PROFESORES Y 5 CURSOS
        // ================================================================
        System.out.println("\n=== CREACION DE PROFESORES Y CURSOS ===");
        
        // Crear profesores
        Profesor prof1 = new Profesor("P001", "Dr. Carlos Mendoza", "Matematicas");
        Profesor prof2 = new Profesor("P002", "Dra. Ana Lopez", "Fisica");
        Profesor prof3 = new Profesor("P003", "Mg. Pedro Garcia", "Programacion");
        
        // Crear cursos
        Curso curso1 = new Curso("MAT101", "Calculo I");
        Curso curso2 = new Curso("MAT102", "Calculo II");
        Curso curso3 = new Curso("FIS101", "Fisica General");
        Curso curso4 = new Curso("PROG101", "Programacion I");
        Curso curso5 = new Curso("PROG102", "Programacion II");
        
        // ================================================================
        // 2. AGREGAR PROFESORES Y CURSOS A LA UNIVERSIDAD
        // ================================================================
        System.out.println("\n=== REGISTRO EN UNIVERSIDAD ===");
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        System.out.println("Profesores y cursos registrados exitosamente");
        
        // ================================================================
        // 3. ASIGNAR PROFESORES A CURSOS
        // ================================================================
        System.out.println("\n=== ASIGNACIÓN DE PROFESORES A CURSOS ===");
        universidad.asignarProfesorACurso("MAT101", "P001"); // Cálculo I → Dr. Mendoza
        universidad.asignarProfesorACurso("MAT102", "P001"); // Cálculo II → Dr. Mendoza
        universidad.asignarProfesorACurso("FIS101", "P002"); // Física → Dra. López
        universidad.asignarProfesorACurso("PROG101", "P003"); // Programación I → Mg. García
        
        System.out.println("Asignaciones completadas");
        
        // ================================================================
        // 4. LISTAR CURSOS CON PROFESOR Y PROFESORES CON SUS CURSOS
        // ================================================================
        System.out.println("\n=== LISTADO COMPLETO ===");
        universidad.listarCursos();
        universidad.listarProfesores();
        
        // Mostrar cursos por profesor
        System.out.println("\n=== CURSOS POR PROFESOR ===");
        universidad.listarProfesores();
        
        // ================================================================
        // 5. CAMBIAR PROFESOR DE UN CURSO Y VERIFICAR SINCRONIZACION
        // ================================================================
        System.out.println("\n=== CAMBIO DE PROFESOR ===");
        System.out.println("ANTES - Curso PROG101:");
        Curso prog101 = universidad.buscarCursoPorId("PROG101");
        prog101.mostrarInfo();
        
        System.out.println("\nCambiando profesor de PROG101 a Dr. Mendoza...");
        universidad.asignarProfesorACurso("PROG101", "P001");
        
        System.out.println("DESPUES - Curso PROG101:");
        prog101.mostrarInfo();
        
        System.out.println("\nVerificacion - Cursos del Dr. Mendoza:");
        prof1.mostrarCursos();
        
        System.out.println("\nVerificacion - Cursos del Mg. Garcia:");
        prof3.mostrarCursos();
        
        // ================================================================
        // 6. REMOVER UN CURSO Y CONFIRMAR ACTUALIZACIÓN
        // ================================================================
        System.out.println("\n=== ELIMINACION DE CURSO ===");
        System.out.println("Cursos del Dr. Mendoza antes de eliminar MAT101:");
        prof1.mostrarCursos();
        
        universidad.eliminarCurso("MAT101");
        
        System.out.println("\nCursos del Dr. Mendoza despues de eliminar MAT101:");
        prof1.mostrarCursos();
        
        // ================================================================
        // 7. REMOVER UN PROFESOR Y DEJAR CURSOS SIN PROFESOR
        // ================================================================
        System.out.println("\n=== ELIMINACION DE PROFESOR ===");
        System.out.println("Curso FIS101 antes de eliminar a la Dra. Lopez:");
        curso3.mostrarInfo();
        
        universidad.eliminarProfesor("P002");
        
        System.out.println("\nCurso FIS101 despues de eliminar a la Dra. Lopez:");
        curso3.mostrarInfo();
    }
    
}
