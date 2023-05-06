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


public class CodexTest_0_7_33 { 
  @Test
    public void testAdd() {
    AlgVector a = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector b = new AlgVector(new double[]{4.0, 5.0, 6.0});
    AlgVector c = a.add(b);
    assertEquals("1. element differs", 5.0, c.getElement(0), 1e-7);
    assertEquals("2. element differs", 7.0, c.getElement(1), 1e-7);
    assertEquals("3. element differs", 9.0, c.getElement(2), 1e-7);
  }
```
}