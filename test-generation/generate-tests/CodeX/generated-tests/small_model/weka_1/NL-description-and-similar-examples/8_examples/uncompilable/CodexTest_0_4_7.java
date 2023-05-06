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


public class CodexTest_0_4_7 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(2, 3, 4);
    AlgVector b = new AlgVector(3, 4, 5);
    AlgVector c = a.add(b);
    assertEquals(new AlgVector(5, 7, 9), c);
  }
}