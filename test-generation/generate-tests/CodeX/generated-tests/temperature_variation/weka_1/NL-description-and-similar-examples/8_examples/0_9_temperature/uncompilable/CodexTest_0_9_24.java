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


public class CodexTest_0_9_24 { 
  @Test
    public void testAddRight() {
	//Test the add(AlgVector) method
    	AlgVector v = new AlgVector(5);
		double[] dataA = {1,2,3,4,5};
		AlgVector av = new AlgVector(dataA);
		v.add(av);
		double[] exp = {1,2,3,4,5};
		assertArrayEquals("AlgVector Add", exp, v.getData(), 0.001);
	}
}