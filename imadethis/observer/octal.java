
import java.util.*;

/**
 *
 */
public class octal extends observer {

    /**
     * Default constructor
     */
    public octal(Subject subject) {
      this.subject=subject;
      this.subject.attach(this);
    }
    public void update() {
         System.out.println( "octal String: " + Integer.toOctalString( subject.getstate() ) );
    }

}
