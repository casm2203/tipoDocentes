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
public class catedratico extends Profesor {

    private int horasClase;

    public catedratico() {
        this.horasClase = 0;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    @Override
    public String mostrar() {
        String infoCate = super.mostrar() + "\n-Horas de clases: " + this.horasClase;
        return infoCate;
    }
}
