/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * Crear una clase Gallina con los atributos: idGallina, edad, 
 * huevosPuestos. 
 * Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
 * Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y 
 * mostrar su estado. 
 * 
 * @author Gabriel
 */
public class Gallinas {
    private static int cantidadGallinas = 1;
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallinas(){
        idGallina = cantidadGallinas;
        cantidadGallinas++;
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostarEstado(){
        System.out.printf("Id de la gallina: %d\nEdad: %d\nHuevos Puestos:%d\n", idGallina, edad, huevosPuestos);
    }
}
