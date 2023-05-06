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


public class CodexTest_0_6_69 { 
  @Test
    public void testGetAsInstance() {
        try {
            int numAttr = 5;
            Instances data = new Instances(new StringReader(
                    "Relation test\n"
                    + "Attributes\n"
                    + "\tNumeric\tattr1\n"
                    + "\tNumeric\tattr2\n"
                    + "\tNominal\tattr3 {a, b, c}\n"
                    + "\tNominal\tattr4 {d, e, f}\n"
                    + "\tNumeric\tattr5\n"
                    + "Data\n\n"), false);
            double[] dataValues = new double[numAttr];
            dataValues[0] = 1;
            dataValues[1] = 2;
            dataValues[3] = 1;
            dataValues[4] = 3;
            AlgVector v = new AlgVector(dataValues);
            Random r = new Random(1);
            Instance inst = v.getAsInstance(data, r);
            assertEquals("Wrong number of attributes", numAttr, inst.numAttributes());
            assertEquals("Wrong attribute value", dataValues[0], inst.value(0));
            assertEquals("Wrong attribute value", dataValues[1], inst.value(1));
            assertEquals("Wrong attribute value", 1, (int) inst.value(2));
            assertEquals("Wrong attribute value", dataValues[3], inst.value(3));
            assertEquals("Wrong attribute value", dataValues[4], inst.value(4));
        } catch (Exception e) {
            fail("Exception generated: " + e.getMessage());
        }
    }
}