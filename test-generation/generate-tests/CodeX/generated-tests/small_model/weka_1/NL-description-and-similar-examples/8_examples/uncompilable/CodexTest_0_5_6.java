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


public class CodexTest_0_5_6 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(3,2.0,1.0);
    AlgVector b = new AlgVector(3,1.0,2.0);
    AlgVector c = a.add(b);
    assertEquals(new AlgVector(3,3.0,3.0), c);
  }
}