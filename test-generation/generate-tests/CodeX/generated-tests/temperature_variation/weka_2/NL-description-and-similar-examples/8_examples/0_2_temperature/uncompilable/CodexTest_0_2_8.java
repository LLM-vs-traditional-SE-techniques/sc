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


public class CodexTest_0_2_8 { 
  @Test
    public void testGetAsInstance() {
        double[] data = {2.3, 1.2, 5.0};
        AlgVector v = new AlgVector(data);
        Instances model = new Instances(new FastVector(), 0);
        model.insertAttributeAt(new Attribute("a"), 0);
        model.insertAttributeAt(new Attribute("b"), 1);
        model.insertAttributeAt(new Attribute("c"), 2);
        Random random = new Random(1);
        Instance inst = v.getAsInstance(model, random);
        assertEquals("Length differs", data.length, inst.numValues());
        assertEquals("a differs", data[0], inst.value(0));
        assertEquals("b differs", data[1], inst.value(1));
        assertEquals("c differs", data[2], inst.value(2));
    }
}