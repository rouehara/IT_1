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
public class Cuidador extends Persona {

    private int cantidadDeRaciones;

   public Cuidador(String nombre, Date fechaDeNacimiento, int cR) {
        super(nombre,fechaDeNacimiento);
       // super();
        this.cantidadDeRaciones = cR;

    }

    public void alimentarAnimales() {
        if ((Zoologico.CANTIDAD_ANIMALES * Zoologico.RACIONES_POR_ANIMAL) <= cantidadDeRaciones) {
            System.out.println("ok");
        } else {
            System.out.println("no ok");
        }
    }
}
