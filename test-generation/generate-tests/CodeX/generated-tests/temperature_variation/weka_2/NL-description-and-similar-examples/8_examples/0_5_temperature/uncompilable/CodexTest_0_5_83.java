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


public class CodexTest_0_5_83 { 
    @Test
    public void testGetAsInstance() {
        double[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        AlgVector v = new AlgVector(data);
        Random random = new Random();
        Instances instances = new Instances(new BufferedReader(new StringReader(instancesString)));
        Instance instance = v.getAsInstance(instances, random);
        assertEquals("Number of attributes differ", instances.numAttributes(), instance.numAttributes());
        for (int i = 0; i < instances.numAttributes(); i++) {
            Attribute attribute = instances.attribute(i);
            if (attribute.isNumeric()) {
                assertEquals((i+1) + ". value differs", data[i], instance.value(i), 0.01);
            }
            if (attribute.isNominal()) {
                int newVal = (int) (random.nextDouble() * (double) (attribute.numValues()));
                if (newVal == (int) attribute.numValues())
                    newVal -= 1;
                assertEquals((i+1) + ". value differs", newVal, instance.value(i), 0.01);
            }
        }
    }
}