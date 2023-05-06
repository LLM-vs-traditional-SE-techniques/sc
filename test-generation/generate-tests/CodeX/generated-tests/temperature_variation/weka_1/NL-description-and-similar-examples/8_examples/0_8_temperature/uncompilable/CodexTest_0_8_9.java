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


public class CodexTest_0_8_9 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector();
    AlgVector v2 = new AlgVector();
     v1.setElement(0, 1.0);
     v2.setElement(0, 1.0);
     v1.setElement(1, -1.0);
     v2.setElement(1, 2.0);
    v1.add(v2);
     if (!(v1.getElement(0) == 2.0 && v1.getElement(1) == 1.0))
      fail("Error in AlgVector add(AlgVector other)");
  }
}