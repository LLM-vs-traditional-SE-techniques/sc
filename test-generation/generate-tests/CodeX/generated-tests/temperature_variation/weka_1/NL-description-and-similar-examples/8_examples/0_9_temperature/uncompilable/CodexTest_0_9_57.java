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


public class CodexTest_0_9_57 { 
  @Test
    // test adding vectors with same dimensions
    public void testAdd() throws CloneNotSupportedException {
     AlgVector v = new AlgVector(4);
     AlgVector w = new AlgVector(4);
     AlgVector u = new AlgVector(4);
     v.set(0, 1);
     v.set(1, 2);
     v.set(2, 3);
     v.set(3, 4);
     w.set(0, 1);
     w.set(1, 2);
     w.set(2, 3);
     w.set(3, 4);
     u.set(0, 2);
     u.set(1, 4);
     u.set(2, 6);
     u.set(3, 8);
     assertTrue("Sum of vectors is incorrect", u.equals(v.add(w)));
 }
}