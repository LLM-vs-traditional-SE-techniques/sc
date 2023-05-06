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


public class CodexTest_0_6_44 { 
    @Test
    public void testGetAsInstance() {
        double[] elements = {1.2, 3.4, 5.6, 7.8};
        AlgVector vector = new AlgVector(elements);
        try {
            Instances instances = new Instances(new BufferedReader(new StringReader(
                    "E,F,G,H\n" +
                    "1,2,3,4\n" +
                    "5,6,7,8\n" +
                    "9,10,11,12\n" +
                    "13,14,15,16")));
            Random random = new Random(1);
            for (int i = 0; i < 10; i++) {
                Instance instance = vector.getAsInstance(instances, random);
                assertTrue("Length differs", instance.numValues() == instances.numAttributes());
                for (int j = 0; j < instances.numAttributes(); j++) {
                    if (instances.attribute(j).isNumeric()) {
                        assertTrue("Value differs", elements[j] == instance.value(j));
                    }
                    if (instances.attribute(j).isNominal()) {
                        assertTrue("Value differs", instances.attribute(j).value((int) instance.value(j)).equals(instance.stringValue(j)));
                    }
                }
            }
        } catch (Exception ex) {
            fail("Exception occured: " + ex.getMessage());
        }
    }
}