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


public class CodexTest_0_9_10 { 
  @Test
  public void testGetAsInstance() throws Exception{
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Random random = new MockRandom();
			Instance instance = v.getAsInstance(null, random);
			assertNotNull(instance);
			assertEquals("values are not equal", 2.3, instance.value(0));
			assertEquals("values are not equal", 1.2, instance.value(1));
			assertEquals("values are not equal", 5.0, instance.value(2));
		  }
}