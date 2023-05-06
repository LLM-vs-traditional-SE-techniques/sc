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


public class CodexTest_0_4_71 { 
  @Test
    public void testGetAsInstance() {
			// given
			AlgVector vector = new AlgVector(new double[] {1.0, 2.0});
			// when
			Instance instance = vector.getAsInstance(null, null);
			// then
			assertEquals(2, instance.numAttributes());
			assertEquals(1.0, instance.value(0), 0.0);
			assertEquals(2.0, instance.value(1), 0.0);
		}
}