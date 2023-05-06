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


public class CodexTest_0_9_2 { 
  @Test
    public void testSetElement() {
		AlgVector vector = new AlgVector(5);
        vector.setElement(3, 2.3);
		assertEquals("Element not altered", 2.3, 
          vector.getElement(3));
		}
}