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


public class CodexTest_0_9_7 { 
  @Test
    public void testGetAsInstanceWithRandom() throws Exception {
			// given
			AlgVector underTest = new AlgVector(new double[] { 3.2, 2.2, 3.2, 10.1 });
			Instances model = new Instances(new Instance(0), 0);
			Attribute att = new Attribute("att");
			model.insertAttributeAt(att, 0);
			// when
			Instance result = underTest.getAsInstance(model, new Random());
			// then
			assertEquals(3.2, result.value(0));
		}
}