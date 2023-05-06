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


public class CodexTest_0_7_11 { 
  @Test
    public void testGetAsInstance_Nominal() {
        double[] data = {2.3, 1.2, 5.0};
        AlgVector v = new AlgVector(data);
        Instances model = new Instances(new StringReader(
                "foo,Nom:nom1,Nom:nom2,Nom:nom3,Nom:nom4,Nom:nom5,Nom:nom6,Nom:nom7,Num:num1,Num:num2,Num:num3,Num:num4,Num:num5,Num:num6\n"
                + "foo,?,?,?,?,?,?,?,?,?,?,?,?,?\n"
                + "foo,?,?,?,?,?,?,?,?,?,?,?,?,?\n"));
        Random random = new Random(1);
        try {
            Instance newInst = v.getAsInstance(model, random);
            assertEquals("foo", newInst.stringValue(0));
            assertEquals("nom4", newInst.stringValue(1));
            assertEquals("nom2", newInst.stringValue(2));
            assertEquals("nom3", newInst.stringValue(3));
            assertEquals("nom5", newInst.stringValue(4));
            assertEquals("nom2", newInst.stringValue(5));
            assertEquals("nom6", newInst.stringValue(6));
            assertEquals("nom6", newInst.stringValue(7));
            assertEquals(2.3, newInst.value(8), 0.001);
            assertEquals(1.2, newInst.value(9), 0.001);
            assertEquals(5.0, newInst.value(10), 0.001);
            assertEquals(0.0, newInst.value(11), 0.001);
            assertEquals(0.0, newInst.value(12), 0.001);
            assertEquals(0.0, newInst.value(13), 0.001);
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}