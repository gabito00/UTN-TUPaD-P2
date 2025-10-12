/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer12;

/**
 *
 * @author Gabriel
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    @Override
    public String toString() {
        String contribStr;
        if (getContribuyente() == null) {
            contribStr = "(sin contribuyente)";
        } else {
            String n = (getContribuyente().getNombre() != null && !getContribuyente().getNombre().isEmpty())
                    ? getContribuyente().getNombre() : "-";
            String cuil = (getContribuyente().getCuil() != null && !getContribuyente().getCuil().isEmpty())
                    ? getContribuyente().getCuil() : "-";
            contribStr = n + " [" + cuil + "]";
        }
        return "Impuesto{monto=" + getMonto() + ", contribuyente=" + contribStr + "}";
    }

}
