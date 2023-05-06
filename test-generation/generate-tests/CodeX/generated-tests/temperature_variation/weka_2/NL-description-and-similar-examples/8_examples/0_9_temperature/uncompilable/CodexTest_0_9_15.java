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


public class CodexTest_0_9_15 { 
  @Test
        public void testGetAsInstance() {
            Instances data = makeTestInstances();;
            Random r = new java.util.Random(0L);
            Vector v = new Vector(new double[]{1, 2, 3, 4});
            try {
                Instance in = v.getAsInstance(data, r);
                assertTrue("Instances and Vector are not compatible", 
			       in.numAttributes() == data.numAttributes());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}