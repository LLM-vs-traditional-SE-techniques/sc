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


public class CodexTest_0_4_25 { 
  @Test
    public void testGetAsInstance() {
        double[] vals = {0.0, 1.0, 2.0, 3.0};
        AlgVector v = new AlgVector(vals);
        Instances model = new Instances(new FastVector(), 0);
        model.insertAttributeAt(new Attribute("first"), 0);
        model.insertAttributeAt(new Attribute("second"), 1);
        model.insertAttributeAt(new Attribute("third"), 2);
        model.insertAttributeAt(new Attribute("fourth"), 3);
        Instance inst = v.getAsInstance(model, new Random(1));
        assertEquals(0.0, inst.value(0));
        assertEquals(1.0, inst.value(1));
        assertEquals(2.0, inst.value(2));
        assertEquals(3.0, inst.value(3));
    }
}