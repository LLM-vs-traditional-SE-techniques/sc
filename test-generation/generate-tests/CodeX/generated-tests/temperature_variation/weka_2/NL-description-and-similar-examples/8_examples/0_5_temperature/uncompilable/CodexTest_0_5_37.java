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


public class CodexTest_0_5_37 { 
  @Test
    public void testGetAsInstance() {
        try {
            Instances inst = new Instances(new StringReader(
                    "a,b,c,d,e\n"
                    + "1,2,3,4,5\n"
                    + "6,7,8,9,10\n"
                    + "11,12,13,14,15\n"));
            inst.setClassIndex(inst.numAttributes() - 1);
            AlgVector v = new AlgVector(inst.numAttributes());
            for (int i = 0; i < inst.numAttributes(); i++) {
                v.setElement(i, i + 1);
            }
            Instance result = v.getAsInstance(inst, new Random(1));
            assertEquals("Number of attributes differs", inst.numAttributes(), result.numAttributes());
            assertEquals("Number of classes differs", inst.numClasses(), result.numClasses());
            assertEquals("Number of values differs", inst.numValues(), result.numValues());
            assertEquals("Number of missing values differs", inst.numMissingValues(), result.numMissingValues());
            assertEquals("Class index differs", inst.classIndex(), result.classIndex());
            assertEquals("Class attribute differs", inst.classAttribute(), result.classAttribute());
            for (int i = 0; i < inst.numAttributes(); i++) {
                if (inst.attribute(i).isNumeric()) {
                    assertEquals("Value differs", i + 1, result.value(i), 0.0001);
                } else {
                    assertEquals("Value differs", 1, result.value(i), 0.0001);
                }
            }
        } catch (Exception e) {
            fail("Exception occurred: " + e.toString());
        }
    }
}