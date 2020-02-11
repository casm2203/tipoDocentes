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
public class Profesor {

    private int Id;
    private String nombre;
    private String apellido;

    public Profesor() {
        this.Id = 0;
        this.nombre = "";
        this.apellido = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String mostrar() {
        
        String info = "-Id: " + this.Id + "\n-Nombre: " + this.nombre + "\n-Apellido: " + this.apellido;

        return info;
    }

}
