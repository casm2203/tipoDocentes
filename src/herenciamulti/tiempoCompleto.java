/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// herencia tipo de herencia, sobre carga y sobre escritura
package herenciamulti;

/**
 *
 * @author csuarez25
 */
public class tiempoCompleto extends Profesor{

    private int tiempoServicio;
    private String dedicacion;

    public tiempoCompleto() {
        super();
        this.tiempoServicio = 0;
        this.dedicacion = "";
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }
    
    @Override
    public String mostrar (){
        String infoTC = super.mostrar()+"\n-Dedicacion: "+ this.dedicacion+"\n-Tiempo de servicio: "+ this.tiempoServicio;
        
        return infoTC;
    }
    

}
