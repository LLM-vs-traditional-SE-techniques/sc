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


public class CodexTest_0_3_9 { 
  @Test
    public void testGetAsInstance() {
			// given
			double[] elements = {1.0, 2.0};
			Instance instance = new DenseInstance(2);
			instance.setDataset(new Instances("test", new ArrayList<Attribute>(), 0));
			instance.setValue(0, 1.0);
			instance.setValue(1, 2.0);
			// when
			Instance result = new DenseDoubleMatrix1D(elements).getAsInstance(instance.dataset(), new Random());
			// then
			assertEquals(instance, result);
		}
}