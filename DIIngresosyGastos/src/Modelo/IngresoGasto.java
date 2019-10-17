/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author mateu
 */
public class IngresoGasto {

    private String fecha;
    private String concepto;
    private int importe;
    private int ingreso;
    private int gasto;

    public IngresoGasto(String fecha, String concepto, int importe) {
        this.fecha = fecha;
        this.concepto = concepto;
        if (importe >= 0) {
            importe = ingreso;

        } else {
            importe = gasto;
        }
    }

    public IngresoGasto() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public long getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String[] toArrayStringIngreso() {
        String[] ingreso = new String[4];
        ingreso[0] = this.fecha;
        ingreso[1] = this.concepto;
        ingreso[2] = Integer.toString(this.ingreso);
        ingreso[3] = Integer.toString(this.gasto);

        return ingreso;
    }

    @Override
    public String toString() {
        return "IngresoGasto{" + "fecha=" + fecha + ", concepto=" + concepto + ", importe=" + importe + '}';
    }

}
