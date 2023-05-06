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


public class CodexTest_0_8_6 { 
  @Test
    public void testGetAsInstance_singleInstance_nominal() throws Exception {
        DataGenerator gen = new DataGenerator();
        double[] attValues = new double[]{1};
        Instances data = gen.generateData(1, attValues);
        for (int i = 0; i < data.numAttributes(); i++) {
            Attribute att = data.attribute(i);
            att.setType(Attribute.NOMINAL);
        }
        Attribute att = data.attribute(0);
        for (int i = 0; i < 10; i++) {
            double[] elements = new double[]{i};
            Instance instance = new InstanceGenerator().getAsInstance(data, new Random());
            assertEquals(1, instance.numAttributes());
            assertEquals(0, instance.classIndex());
            assertEquals(i, instance.value(att), 0);
            assertEquals(String.valueOf(i), instance.stringValue(att));
        }
    }
}

}