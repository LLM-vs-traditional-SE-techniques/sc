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


public class CodexTest_0_9_98 { 
  @Test
      public void testIsInRangeInt() {
      		IntVector v = new IntVector(new int[]{0, 0, 3});
      		assertTrue("Check 0..30", v.isInRange(0, 30));
      		assertFalse("Check 2..30", v.isInRange(2, 30));
      		assertTrue("Check 0..100", v.isInRange(0, 100));
      	}
    }
}