/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7e2;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Crear array de Figuras (polimorfismo)
        Figura[] figuras = {
            new Circulo("Círculo pequeño", 5.0),
            new Rectangulo("Rectángulo grande", 10.0, 6.0),
            new Circulo("Círculo mediano", 7.5),
            new Rectangulo("Cuadrado", 4.0, 4.0)
        };
        
        // Calcular y mostrar áreas usando polimorfismo
        System.out.println("=== ÁREAS DE FIGURAS ===");
        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.nombre);
            System.out.println("Area: " + figura.calcularArea());
        }
    }
    
}
