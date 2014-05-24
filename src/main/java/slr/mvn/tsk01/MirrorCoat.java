package slr.mvn.tsk01;

/**
 *
 * @author Aaron
 */
public class MirrorCoat {
    private static int counter = 0;

    public static int getCounter() {
        counter++;
        return counter;
    }

    public static void setCounter(int aCounter) {
        counter = aCounter;
    }
}
