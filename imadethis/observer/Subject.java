
import java.util.*;

public class Subject {
ArrayList<observer>observers=new ArrayList<observer>();
public int state;
    public Subject() {
    }

    /**
     *
     */
    public int getstate() {
        return state;

    }


    public void setstate(int state) {
      this.state=state;
      notifyallobservers();

    }

    public void attach(observer ob) {
        observers.add(ob);
    }

    public void notifyallobservers() {
      for(observer obs : observers)
      {
        obs.update();
      }
    }

    /**
     *
     */

}
