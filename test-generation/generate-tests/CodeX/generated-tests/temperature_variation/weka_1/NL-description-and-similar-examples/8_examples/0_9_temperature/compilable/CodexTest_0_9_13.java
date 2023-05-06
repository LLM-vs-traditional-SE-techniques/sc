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


public class CodexTest_0_9_13 { 
  @Test
    public void testAdd() throws Exception {
		AlgVector v =new AlgVector(3);
		v.setElement(0,3.14);
		v.setElement(1,2.73);
		v.setElement(2,6.28);
		AlgVector w =v.add(v);
		for (int i = 0; i < v.numElements(); i++) {
			assertEquals((i + 1) + ". element wrong", v.getElement(i) + v.getElement(i), w.getElement(i), 0.0);
}
	}
}