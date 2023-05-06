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
     public void testAddValues() {
         final Random random = new Random();
         final AlgVector a = nextRandomVector(random);
         final AlgVector b = nextRandomVector(random);
         final AlgVector c = a.add(b);
         assertEquals(a.size(), b.size());
         assertEquals(a.size(), c.size());
         for (int k = 0; k < a.size(); ++k) {
             assertEquals(a.get(k) + b.get(k), c.get(k), 1.0e-15);
         }
     }

}