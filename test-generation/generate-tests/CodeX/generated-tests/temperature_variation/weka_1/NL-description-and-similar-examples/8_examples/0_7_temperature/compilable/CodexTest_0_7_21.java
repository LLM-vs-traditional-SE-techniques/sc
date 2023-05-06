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


public class CodexTest_0_7_21 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(10);
	AlgVector v2 = new AlgVector(10);
	AlgVector v3 = v1.add(v2);
	assertNotNull(v3);
	assertEquals(10, v3.numElements());
	for (int i = 0; i < 10; i++)
	  assertEquals(0.0, v3.getElement(i));
    }
}