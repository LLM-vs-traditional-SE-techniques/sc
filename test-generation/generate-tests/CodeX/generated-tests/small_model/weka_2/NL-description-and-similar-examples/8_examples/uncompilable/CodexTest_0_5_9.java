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


public class CodexTest_0_5_9 { 
  @Test
    public void testGetAsInstanceShouldReturnNullWhenNoData() throws Exception {
			// given
			Instance newInst = null;
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(new double[] {1, 2, 3});
			// when
			Instance result = vector.getAsInstance(null, null);
			// then
			assertEquals(newInst, result);
		}
}