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
public class medioTiempo extends Profesor {

    private int horasDocencia;
    private int horasAdministrativas;

    public medioTiempo() {
        super();
        this.horasDocencia = 0;
        this.horasAdministrativas = 0;
    }

    public int getHorasDocencia() {
        return horasDocencia;
    }

    public void setHorasDocencia(int horasDocencia) {
        this.horasDocencia = horasDocencia;
    }

    public int getHorasAdministrativas() {
        return horasAdministrativas;
    }

    public void setHorasAdministrativas(int horasAdministrativas) {
        this.horasAdministrativas = horasAdministrativas;
    }

    @Override
    public String mostrar() {
        String infoTM = super.mostrar() + "\n-Horas de docencia: " + this.horasDocencia + "\n-Horas administrativas: " + this.horasAdministrativas;
        return infoTM;
    }
}
