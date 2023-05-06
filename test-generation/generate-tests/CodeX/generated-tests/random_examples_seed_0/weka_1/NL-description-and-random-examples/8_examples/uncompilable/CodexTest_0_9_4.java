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
        public void testAdd() {
          AlgVector a = new AlgVector(new float[]{8.9, 1.2, 54.3});
          AlgVector b = new AlgVector(new float[]{3.2, 4.2, 3.1});
          AlgVector c = a.add(b);
          assertEquals(12.1, c.get(0), 0.001);
          assertEquals(5.4, c.get(1), 0.001);
          assertEquals(57.4, c.get(2), 0.001);
        }
}