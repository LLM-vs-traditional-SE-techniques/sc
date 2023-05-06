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


public class CodexTest_0_4_14 { 
  @Test
    public void testGetAsInstance() {
			AlgVector vec = new AlgVector(new double[] { 2, 3, 4 });
			Instances inst = new Instances(new FastVector(), 0);
			inst.insertAttributeAt(new Attribute("a"), 0);
			inst.insertAttributeAt(new Attribute("b"), 1);
			inst.insertAttributeAt(new Attribute("c"), 2);
			Instance inst1 = vec.getAsInstance(inst, new Random(1));
			assertEquals("a", 2.0, inst1.value(0));
			assertEquals("b", 3.0, inst1.value(1));
			assertEquals("c", 4.0, inst1.value(2));
		}
}