import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_7 { 
  @Test
   public void testAdd(){
    AlgVector a = new AlgVector(3.3);
    AlgVector b = new AlgVector(4.4);
    AlgVector c = new AlgVector(5.5);
      a.add(b);
      b.add(c);
    assertEquals(0.0, b.add(c), 1.0e-12);
    assertEquals(0.0,c.add(a), 1.0e-12);
    assertEquals(5.5,c.add(a), 1.0e-12);
    assertEquals(3.3,a.add(b), 1.0e-12);
  }
}