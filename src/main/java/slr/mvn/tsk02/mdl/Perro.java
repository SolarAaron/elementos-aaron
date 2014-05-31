package slr.mvn.tsk02.mdl;

/**
 * Yo dawg, herd u like dawgs
 * @author aaron
 */
public class Perro {
    private String nombre;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRegister(){
        return "Registrado: " + nombre;
    }
}
