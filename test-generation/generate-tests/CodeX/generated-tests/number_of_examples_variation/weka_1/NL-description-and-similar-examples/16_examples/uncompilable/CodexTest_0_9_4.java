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


public class CodexTest_0_9_4 { 
  @Test
  public void test3() {
    AlgVector w = a.add(b);
    AlgVector v = b.add(a);
    if (v.equals(w)) {
       System.out.println(v.equals(w));
    }
    assertEquals(v, w);
  }
}