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


public class CodexTest_0_4_5 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(1);
    a.setElement(0, 1);
    AlgVector b = new AlgVector(1);
    b.setElement(0, 2);
    AlgVector c = a.add(b);
    assertEquals(3, c.getElement(0), 0);
  }
}