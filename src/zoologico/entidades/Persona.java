/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public abstract class Persona {

    private String nombre;
    private Date fechaDeNacimiento;

    public String getNombre() {
        return this.nombre;
    }

    public void setfechaDeNacimiento(Date fechaDeNacimiento) {

        this.fechaDeNacimiento = fechaDeNacimiento;

    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        // llamar a superclases
        // super();
        this.nombre = nombre;

        this.fechaDeNacimiento = fechaDeNacimiento;

    }

}
