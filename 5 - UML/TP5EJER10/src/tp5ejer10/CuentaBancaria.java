/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejer10;

/**
 *
 * @author Gabriel
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this)
            titular.setCuentaBancaria(this);
    }
    
    @Override
    public String toString() {
        String scbu = (getCbu() != null && !getCbu().isEmpty()) ? getCbu() : "-";
        String sTit = (getTitular() != null)
                ? ( (getTitular().getNombre() != null ? getTitular().getNombre() : "-")
                    + " (DNI " + (getTitular().getDni() != null ? getTitular().getDni() : "-") + ")" )
                : "(sin titular)";
        String sClave;
        if (getClaveSeguridad() == null) {
            sClave = "(sin clave)";
        } else {
            String cod = (getClaveSeguridad().getCodigo() != null && !getClaveSeguridad().getCodigo().isEmpty())
                    ? getClaveSeguridad().getCodigo() : "-";
            String f   = (getClaveSeguridad().getUltimaModificacion() != null && !getClaveSeguridad().getUltimaModificacion().isEmpty())
                    ? getClaveSeguridad().getUltimaModificacion() : "-";
            sClave = "Clave{codigo='" + cod + "', ultimaModificacion='" + f + "'}";
        }
        return "CuentaBancaria{cbu='" + scbu + "', saldo=" + getSaldo() + ", titular=" + sTit + ", " + sClave + "}";
    }

}
