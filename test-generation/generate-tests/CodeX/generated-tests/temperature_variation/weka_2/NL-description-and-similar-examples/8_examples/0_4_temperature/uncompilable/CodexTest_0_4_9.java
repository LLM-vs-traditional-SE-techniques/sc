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


public class CodexTest_0_4_9 { 
  @Test
    public void testGetAsInstance() {
        int numAttribs = 3;
        int numInstances = 10;
        int numClasses = 2;
        int numNumeric = 2;
        int numNominal = 1;
        Random random = new Random(1);
        Instances model = TestInstances.createRandomInstances(numAttribs, numInstances, numClasses, numNumeric, numNominal, random);
        AlgVector v = new AlgVector(numNumeric);
        for (int i = 0; i < numNumeric; i++) {
            v.setElement(i, random.nextDouble());
        }
        Instance newInst = v.getAsInstance(model, random);
        assertEquals("Number of attributes differ", numAttribs, newInst.numAttributes());
        assertEquals("Dataset differs", model, newInst.dataset());
        for (int i = 0, j = 0; i < numAttribs; i++) {
            if (model.attribute(i).isNumeric()) {
                assertEquals((i + 1) + ". value differs", v.getElement(j++), newInst.value(i), 1e-6);
            }
            if (model.attribute(i).isNominal()) {
                int newVal = (int) (random.nextDouble() * (double) (model.attribute(i).numValues()));
                if (newVal == (int) model.attribute(i).numValues()) {
                    newVal -= 1;
                }
                assertEquals((i + 1) + ". value differs", newVal, (int) newInst.value(i));
            }
        }
    }
}