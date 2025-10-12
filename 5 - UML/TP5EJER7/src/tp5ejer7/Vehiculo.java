/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer7;

/**
 *
 * @author Gabriel
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this)
            conductor.setVehiculo(this);
    }
    @Override
public String toString() {
    String pat = (getPatente() != null && !getPatente().isEmpty()) ? getPatente() : "-";
    String mod = (getModelo() != null && !getModelo().isEmpty()) ? getModelo() : "-";

    // Resumen del conductor (sin llamar conductor.toString() para evitar loops si cambiás Conductor a futuro)
    String conductorStr = "(sin conductor)";
    if (getConductor() != null) {
        String n = (getConductor().getNombre() != null && !getConductor().getNombre().isEmpty())
                ? getConductor().getNombre() : "-";
        String lic = (getConductor().getLicencia() != null && !getConductor().getLicencia().isEmpty())
                ? getConductor().getLicencia() : "-";
        conductorStr = n + " (Lic " + lic + ")";
    }

    // Resumen del motor (tampoco llamamos motor.toString() por la misma razón)
    String motorStr = "(sin motor)";
    if (getMotor() != null) {
        String t = (getMotor().getTipo() != null && !getMotor().getTipo().isEmpty())
                ? getMotor().getTipo() : "-";
        String ns = (getMotor().getNumeroSerie() != null && !getMotor().getNumeroSerie().isEmpty())
                ? getMotor().getNumeroSerie() : "-";
        motorStr = t + " [" + ns + "]";
    }

    return "Vehículo " + pat + " | Modelo: " + mod
            + " | Conductor: " + conductorStr
            + " | Motor: " + motorStr;
}

}
