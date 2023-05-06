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


public class CodexTest_0_5_39 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    int numAtts = 2;
    Instances model = new Instances("test", new ArrayList(), numAtts);
    model.add(new Attribute("Att1"));
    model.add(new Attribute("Att2"));
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
    assertEquals("First value differs", data[0], inst.value(0), 0.0);
    assertEquals("Second value differs", data[1], inst.value(1), 0.0);
  }
}