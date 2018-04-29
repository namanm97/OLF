
import java.util.*;

/**
 *
 */
public class singleobject {

    /**
     * Default constructor
     */
    private static singleobject instace= new singleobject();

    /**
     *
     */
    private singleobject()
    {}

    /**
     *
     */
    public static singleobject getinstace() {
        return instace;
    }

    /**
     *
     */
    public void print() {
      System.out.println("hello world");
    }



}
