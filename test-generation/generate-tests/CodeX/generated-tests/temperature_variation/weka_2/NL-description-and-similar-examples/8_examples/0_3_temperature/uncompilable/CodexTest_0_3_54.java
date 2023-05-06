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


public class CodexTest_0_3_54 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n" + "1,2,3,4\n" + "5,6,7,8\n" + "9,10,11,12\n")));
        model.setClassIndex(model.numAttributes() - 1);
        AlgVector v = new AlgVector(new double[] { 1, 2, 3, 4 });
        Instance i = v.getAsInstance(model, new Random(0));
        assertEquals("a", i.stringValue(0));
        assertEquals("b", i.stringValue(1));
        assertEquals("c", i.stringValue(2));
        assertEquals("d", i.stringValue(3));
        assertEquals(1.0, i.value(0));
        assertEquals(2.0, i.value(1));
        assertEquals(3.0, i.value(2));
        assertEquals(4.0, i.value(3));
    }
}