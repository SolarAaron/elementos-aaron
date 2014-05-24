package slr.mvn.tsk01;

/**
 *
 * @author Aaron
 */
public class CuentaCheques implements Cuenta{

    @Override
    public String type() {
        return "cheques";
    }
    
}
