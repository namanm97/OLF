
import java.util.*;

/**
 *
 */
public class binary extends observer {

    /**
     * Default constructor
     */
    public binary(Subject subject) {
      this.subject=subject;
      this.subject.attach(this);
    }

    /**
     *
     */
    public void update() {
     System.out.println( "Binary String: " + Integer.toBinaryString( subject.getstate() ) ); 
    }

}
