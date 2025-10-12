/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer13;

/**
 *
 * @author Gabriel
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        String v = (getValor() != null && !getValor().isEmpty()) ? getValor() : "-";
        String uStr;
        if (getUsuario() == null) {
            uStr = "(sin usuario)";
        } else {
            String n = (getUsuario().getNombre() != null && !getUsuario().getNombre().isEmpty())
                    ? getUsuario().getNombre() : "-";
            String e = (getUsuario().getEmail() != null && !getUsuario().getEmail().isEmpty())
                    ? getUsuario().getEmail() : "-";
            uStr = n + " <" + e + ">";
        }
        return "CodigoQR{valor='" + v + "', usuario=" + uStr + "}";
    }

}
