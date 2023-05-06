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


public class CodexTest_0_4_1 { 
  @Test
    public void testGetAsInstance() {
    double[] values = {0.1, 0.2, 0.3};
    AlgVector v = new AlgVector(values);
    Instances model = createModel();
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals("Wrong number of attributes", 3, inst.numAttributes());
    assertEquals("Wrong value for attribute 0", values[0], inst.value(0), 0.00001);
    assertEquals("Wrong value for attribute 1", values[1], inst.value(1), 0.00001);
    assertEquals("Wrong value for attribute 2", values[2], inst.value(2), 0.00001);
  }
}