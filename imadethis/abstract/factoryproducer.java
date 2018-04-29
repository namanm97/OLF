
import java.util.*;

/**
 *
 */
public class factoryproducer {

    /**
     * Default constructor
     */
    public factoryproducer() {
    }

    /**
     *
     */
    public static void main(String args[]) {
      red r=new red();
      circle c=new circle();
      square s=new square();
      blue b =new blue();
      r.printr();
      c.printc();
      s.prints();
      b.printb();

    }

}
