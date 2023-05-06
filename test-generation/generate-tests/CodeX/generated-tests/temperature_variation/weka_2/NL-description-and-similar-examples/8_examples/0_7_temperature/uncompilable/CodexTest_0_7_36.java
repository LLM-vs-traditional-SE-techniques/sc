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


public class CodexTest_0_7_36 { 
  @Test
    public void testGetAsInstance() throws Exception {
    int values = 5;
    double[] elements = {0.0, 1.0, 2.0};
    Instances model = new Instances(new FastVector(), 0);
    model.insertAttributeAt(new Attribute("nominal"), 0);
    model.insertAttributeAt(new Attribute("numeric"), 1);
    model.insertAttributeAt(new Attribute("numeric"), 2);
    AlgVector algVector = new AlgVector(elements);
    Instance instance = algVector.getAsInstance(model, new Random(0));
    assertTrue(instance.value(0) < values);
    assertTrue(instance.value(0) >= 0);
    assertEquals(0.0, instance.value(1), 0.00001);
    assertEquals(1.0, instance.value(2), 0.00001);
    }
}