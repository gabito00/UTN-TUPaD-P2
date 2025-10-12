/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer14;

/**
 *
 * @author Gabriel
 */
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    @Override
    public String toString() {
        String f = (getFormato() != null && !getFormato().isEmpty()) ? getFormato() : "-";
        String pStr;
        if (getProyecto() == null) {
            pStr = "(sin proyecto)";
        } else {
            String n = (getProyecto().getNombre() != null && !getProyecto().getNombre().isEmpty())
                    ? getProyecto().getNombre() : "-";
            String d = String.valueOf(getProyecto().getDuracionMin());
            pStr = n + " [" + d + " min]";
        }
        return "Render{formato='" + f + "', proyecto=" + pStr + "}";
    }

}
