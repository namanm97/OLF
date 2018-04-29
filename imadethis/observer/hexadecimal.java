
import java.util.*;

/**
 *
 */
public class hexadecimal extends observer {

    /**
     * Default constructor
     */
    public hexadecimal(Subject subject) {
      this.subject=subject;
      this.subject.attach(this);
    }

    /**
     *
     */
    public void update() {
        System.out.println( "hex String: " + Integer.toHexString( subject.getstate() ) );
    }

}
