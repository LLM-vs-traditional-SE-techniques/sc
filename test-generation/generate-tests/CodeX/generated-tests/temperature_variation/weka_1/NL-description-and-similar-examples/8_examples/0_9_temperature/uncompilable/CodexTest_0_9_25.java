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


public class CodexTest_0_9_25 { 
  @Test
   public void testAddBothVectorsSameLength() {
			double[] data1={1,2,3};
			double[] data2={6,7,8};
			AlgVector v1 = new AlgVector(data1);
			AlgVector v2 = new AlgVector(data2);
			AlgVector v3 = v1.add(v2);
}