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


public class CodexTest_0_9_52 { 
  @Test
   public void testAddRowVectorAndColumnVector() {
		// create two vectors
		SimpleMatrix b = new SimpleMatrix(new double[][] {{1, 2, 3}});
		SimpleMatrix c = new SimpleMatrix(new double[][] {{1}, {2}, {3}});
}