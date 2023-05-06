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


public class CodexTest_0_7_2 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector();
    Instance inst = null;
    Instances model = null;
    try {
      inst = v.getAsInstance(model, null);
      fail("Exception expected!");
    }
    catch (Exception ex) {
    }
    model = new Instances(new FastVector(), 0);
    model.setClassIndex(0);
    try {
      inst = v.getAsInstance(model, null);
      fail("Exception expected!");
    }
    catch (Exception ex) {
    }
    double[] data = {2.3, 1.2, 5.0};
    v = new AlgVector(data);
    model.insertAttributeAt(new Attribute("att1"), 0);
    model.insertAttributeAt(new Attribute("att2"), 0);
    model.insertAttributeAt(new Attribute("att3"), 0);
    try {
      inst = v.getAsInstance(model, null);
    }
    catch (Exception ex) {
      fail("No Exception expected!");
    }
    assertNotNull(inst);
  }
}