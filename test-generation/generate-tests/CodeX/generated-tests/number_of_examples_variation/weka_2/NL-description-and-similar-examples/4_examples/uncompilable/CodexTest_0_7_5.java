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


public class CodexTest_0_7_5 { 
  @Test
    public void testEquals() {
		AlgVector v = new AlgVector(arr1);
		AlgVector w = new AlgVector(arr1);
		assertTrue("Test Equals", v.equals(w));
	}
}