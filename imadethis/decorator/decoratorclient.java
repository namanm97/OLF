
import java.util.*;

/**
 *
 */
public class decoratorclient {

    /**
     * Default constructor
     */

    public static void main(String args[])
    {
     basiccar b=new basiccar();
     luxurycar l= new luxurycar();
     sportscar s=new sportscar();
     b.assemble();
     l.assemble();
     b.assemble();
     s.assemble();
    }

}
