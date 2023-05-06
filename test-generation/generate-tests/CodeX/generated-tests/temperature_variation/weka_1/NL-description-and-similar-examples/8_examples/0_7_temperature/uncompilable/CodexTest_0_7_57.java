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


public class CodexTest_0_7_57 { 
  @Test
    public void testDotProduct() {
	double[] data = {2.3, 1.2, 5.0};
	AlgVector v = new AlgVector(data);
	AlgVector w = new AlgVector(data);
	double dot = v.dotProduct(w);
	assertEquals("Dot product differs", data[0]*data[0] + data[1]*data[1] + data[2]*data[2], dot);
  }
}