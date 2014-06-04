package slr.mvn.tsk02.mdl.impl;

import slr.mvn.tsk02.mdl.Mascota;

/**
 * @author aaron
 */
public class Perro implements Mascota{
    private String nombre;

    /**
     * @return the nombre
     */
    @Override
    public String getNombre(){
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return the register
     */
    @Override
    public String getRegister(){
        return "Registrado perro: " + nombre;
    }
}
