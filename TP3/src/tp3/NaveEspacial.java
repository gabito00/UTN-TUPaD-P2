/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * 
 * @author Gabriel
 */
public class NaveEspacial {
    private float combustible; 
    private String nombreNave;
    private float totalRecorrido;
    final double CONSUMO_POR_X = 1.5;
    final double CONSUMO_POR_DESPEGUE = 25;
    
    public NaveEspacial(){
        combustible = 30; //combbustible minimo para despegar
        nombreNave = "Apolito I";
    }
    
    public void despegar(){
        combustible -= CONSUMO_POR_DESPEGUE;
    }
    
    public void avanzar(float distancia){
        if (combustible >= (CONSUMO_POR_X * distancia)){
            combustible -= CONSUMO_POR_X * distancia;
            totalRecorrido += distancia;
        }
        else{
            System.out.println("Imposible avanzar la cantidad solicitada, no alcanza el combustible!");
        }
    }
    public void recargarCombustible(float cantidad){
        if (cantidad > 0) {
            combustible += cantidad;
        }
    }
    
    public void mostrarEstado(){
        System.out.printf("La nave: %s\nLe queda: %.2f de combustible\nTotal recorrido: %.2f", nombreNave, combustible, totalRecorrido);
    }
    
    
    
    
}
