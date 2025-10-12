/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer10;

/**
 *
 * @author Gabriel
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
    @Override
    public String toString() {
        String cod = (getCodigo() != null && !getCodigo().isEmpty()) ? getCodigo() : "-";
        String f   = (getUltimaModificacion() != null && !getUltimaModificacion().isEmpty()) ? getUltimaModificacion() : "-";
        return "ClaveSeguridad{codigo='" + cod + "', ultimaModificacion='" + f + "'}";
    }

}
