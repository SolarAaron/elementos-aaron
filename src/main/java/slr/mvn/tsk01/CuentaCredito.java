package slr.mvn.tsk01;

/**
 *
 * @author Aaron
 */
public class CuentaCredito implements Cuenta{

    @Override
    public String type() {
        return "credito";
    }
    
}
