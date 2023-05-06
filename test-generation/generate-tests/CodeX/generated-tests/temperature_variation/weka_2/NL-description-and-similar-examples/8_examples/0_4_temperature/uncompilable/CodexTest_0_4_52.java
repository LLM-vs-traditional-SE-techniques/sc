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


public class CodexTest_0_4_52 { 
  @Test
    public void testGetAsInstance() {
        try {
            AlgVector v = new AlgVector(new double[]{1.0, 2.0});
            Instances model = new Instances(new StringReader("@RELATION test\n" +
                    "@ATTRIBUTE a numeric\n" +
                    "@ATTRIBUTE b numeric\n" +
                    "@ATTRIBUTE c numeric\n" +
                    "@ATTRIBUTE d numeric\n" +
                    "@DATA\n" +
                    "1.0,2.0,3.0,4.0\n" +
                    "5.0,6.0,7.0,8.0\n" +
                    "9.0,10.0,11.0,12.0\n"));
            Instance inst = v.getAsInstance(model, new Random(1));
            assertEquals("Attribute values differ", 1.0, inst.value(0));
            assertEquals("Attribute values differ", 2.0, inst.value(1));
            assertEquals("Attribute values differ", 0.0, inst.value(2));
            assertEquals("Attribute values differ", 0.0, inst.value(3));
        } catch (Exception ex) {
            fail("Exception thrown: " + ex.getMessage());
        }
    }
}