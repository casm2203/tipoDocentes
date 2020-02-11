/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamulti;

/**
 *
 * @author csuarez25
 */
public class docente extends tiempoCompleto {

    private int horasInvestigacion;
    private int horasDocencia;
    private int horasExtension;

    public docente() {
        super();
        this.horasInvestigacion = 0;
        this.horasDocencia = 0;
        this.horasExtension = 0;
    }

    public int getHorasInvestigacion() {
        return horasInvestigacion;
    }

    public void setHorasInvestigacion(int horasInvestigacion) {
        this.horasInvestigacion = horasInvestigacion;
    }

    public int getHorasDocencia() {
        return horasDocencia;
    }

    public void setHorasDocencia(int horasDocencia) {
        this.horasDocencia = horasDocencia;
    }

    public int getHorasExtension() {
        return horasExtension;
    }

    public void setHorasExtension(int horasExtension) {
        this.horasExtension = horasExtension;
    }

    @Override
    public String mostrar() {
        String infoDoc = super.mostrar() + "\n-Horas de investigador: " + this.horasInvestigacion + "\n-Horas de docencia: " + this.horasDocencia + "\n-Horas de extension: " + this.horasExtension;

        return infoDoc;
    }

}
