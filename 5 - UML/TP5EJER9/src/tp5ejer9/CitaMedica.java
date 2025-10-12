/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer9;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class CitaMedica {
    private LocalDate fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(LocalDate fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    @Override
public String toString() {
    String f = (getFecha() != null) ? getFecha().toString() : "-";
    String h = (getHora() != null && !getHora().isEmpty()) ? getHora() : "-";

    String pacStr;
    if (getPaciente() == null) {
        pacStr = "(sin paciente)";
    } else {
        String pn = (getPaciente().getNombre() != null && !getPaciente().getNombre().isEmpty())
                ? getPaciente().getNombre() : "-";
        String pos = (getPaciente().getObraSocial() != null && !getPaciente().getObraSocial().isEmpty())
                ? getPaciente().getObraSocial() : "-";
        pacStr = pn + " [" + pos + "]";
    }

    String profStr;
    if (getProfesional() == null) {
        profStr = "(sin profesional)";
    } else {
        String prn = (getProfesional().getNombre() != null && !getProfesional().getNombre().isEmpty())
                ? getProfesional().getNombre() : "-";
        String pres = (getProfesional().getEspecialidad() != null && !getProfesional().getEspecialidad().isEmpty())
                ? getProfesional().getEspecialidad() : "-";
        profStr = prn + " (" + pres + ")";
    }

    return "CitaMedica{fecha=" + f + ", hora=" + h + ", paciente=" + pacStr + ", profesional=" + profStr + "}";
}

}
