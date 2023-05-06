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


public class CodexTest_0_8_6 { 
  @Test
    public void testAdd() {
	   AlgVector a = new AlgVector(2);
    a.set(0, 1);
    a.set(1, 2);
    AlgVector b = new AlgVector(2);
    b.set(0, 3);
    b.set(1, 4);
    AlgVector c = a.add(b);
    assertEquals(c.get(0), 4);
    assertEquals(c.get(1), 6);
    assertEquals(a.get(0), 1);
    assertEquals(a.get(1), 2);
    }
}