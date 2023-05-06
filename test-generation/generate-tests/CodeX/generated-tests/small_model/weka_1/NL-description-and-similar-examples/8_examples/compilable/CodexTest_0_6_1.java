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


public class CodexTest_0_6_1 { 
  @Test
    public void testAdd() {
			AlgVector v1 = new AlgVector(2);
			v1.setElement(0, 1.0);
			v1.setElement(1, 2.0);
			AlgVector v2 = new AlgVector(2);
			v2.setElement(0, 2.0);
			v2.setElement(1, 2.0);
			AlgVector v3 = v1.add(v2);
			assertEquals(3.0, v3.getElement(0), 0.0);
			assertEquals(4.0, v3.getElement(1), 0.0);
		}
}