
import java.util.*;

/**
 *
 */
public class observerclient {

  public static void main(String args[])
  {
  Subject subject=new Subject();
  new binary(subject);
  new octal(subject);
  new hexadecimal(subject);
  System.out.println("First state change: 15");
      subject.setstate(15);

      System.out.println("First state change: 10");
          subject.setstate(10);



    int a=15;
    
    System.out.println(Integer.toBinaryString(a));

  }
}
