/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Gabriel
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Gabriel", "Developer", 700);
        Empleado emp2 = new Empleado("Jose", "QA Tester");
        Empleado emp3 = new Empleado("Javier", "Scrum Master", 800);
        Empleado[] empleados = { emp1, emp2, emp3 };
        System.out.println("Empleados sin modificar los salarios");
        mostrarEmpleados(empleados);
        emp1.actualizarSalario(100, true);
        emp2.actualizarSalario(0.2);
        emp3.actualizarSalario(50, true);
        System.out.println("Empleados con salarios modificados");
        mostrarEmpleados(empleados);
        
        System.out.println("El total de empleados es: " + Empleado.getTotalEmpleados());
    }
    
    public static void mostrarEmpleados(Empleado[] empleados){
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
    
}
