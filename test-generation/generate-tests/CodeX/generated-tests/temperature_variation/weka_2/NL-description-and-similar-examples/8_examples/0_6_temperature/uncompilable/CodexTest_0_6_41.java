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


public class CodexTest_0_6_41 { 
  @Test
    public void testGetAsInstanceWithRandom() {
        Instances data = new Instances(new StringReader(
            "a, b, c\n"
            + "A, B, C\n"));
        data.setClassIndex(data.numAttributes() - 1);
        AlgVector v = new AlgVector(data.numAttributes());
        v.setElement(0, 1);
        v.setElement(1, 2);
        v.setElement(2, 3);
        Random r = new Random();
        r.setSeed(1);
        Instance i = v.getAsInstance(data, r);
        assertEquals(1.0, i.value(0));
        assertEquals(2.0, i.value(1));
        assertEquals(0.0, i.classValue());
    }
}