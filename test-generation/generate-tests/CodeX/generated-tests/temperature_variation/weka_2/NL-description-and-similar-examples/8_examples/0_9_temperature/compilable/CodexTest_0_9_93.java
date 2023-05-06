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


public class CodexTest_0_9_93 { 
  @Test
    public void testGetAsInstance() {
        int numAttr = 10;
        double[] elements = new double[numAttr];
        for (int i = 0; i < numAttr; i++) {
            elements[i] = i * 2;
        }
        try {
            FastVector atts = new FastVector();
            for (int i = 0; i < numAttr; i++) {
                atts.addElement(new Attribute("Nom" + (i + 1)));
            }
            Instances dataset = new Instances("Test", atts, 0);
            AlgVector v = new AlgVector(elements);
            Instance inst = v.getAsInstance(dataset, new Random());
            assertTrue("Length of instance differs from number of " + "attributes", inst.numAttributes() == numAttr);
            for (int i = 0; i < numAttr; i++) {
                assertEquals(elements[i] / 2, inst.value(i), 0.1);
            }
        } catch (Exception e) {
            fail("Exception occured: " + e);
        }
    }
}