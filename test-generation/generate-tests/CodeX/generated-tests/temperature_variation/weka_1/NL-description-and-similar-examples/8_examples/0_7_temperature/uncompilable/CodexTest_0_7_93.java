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


public class CodexTest_0_7_93 { 
  @Test
  public void testAdd() {
    double a = 1.0;
    double b = 2.0;
    double c = 3.0;
    double d = 4.0;
    AlgVector va = new AlgVector(a, b);
    AlgVector vb = new AlgVector(c, d);
    AlgVector vc = va.add(vb);
    assertEquals(4.0, vc.getElement(0));
    assertEquals(6.0, vc.getElement(1));
  }
}