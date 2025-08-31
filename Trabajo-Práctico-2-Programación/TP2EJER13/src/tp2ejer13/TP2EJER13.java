/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer13;

/**
 *
 * Crea un programa que:
 * a. Declare e inicialice un array con los precios de algunos productos.
 * b. Use una función recursiva para mostrar los precios originales.
 * c. Modifique el precio de un producto específico.
 * d. Use otra función recursiva para mostrar los valores modificados.
 * Salida esperada:
 * Precios originales:
 * Precio: $199.99
 * Precio: $299.5
 * Precio: $149.75
 * Precio: $399.0
 * Precio: $89.99
 * Precios modificados:
 * Precio: $199.99
 * Precio: $299.5
 * Precio: $129.99
 * Precio: $399.0
 * Precio: $89.99
 * @author Gabriel
 */
public class TP2EJER13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
    }
    
    private static void imprimirPrecios(double[] arr, int index) {
        if (index == arr.length) return; // caso base
        if (arr == null) return;
        if (index < 0 || index >= arr.length) { // Validacion para evitar ArrayIndexOutOfBoundsException
            System.out.println("Índice inicial fuera de rango: " + index);
            return;
        }
        System.out.println("Precio: $" + arr[index]);
        imprimirPrecios(arr, index + 1);
    }
    
}
