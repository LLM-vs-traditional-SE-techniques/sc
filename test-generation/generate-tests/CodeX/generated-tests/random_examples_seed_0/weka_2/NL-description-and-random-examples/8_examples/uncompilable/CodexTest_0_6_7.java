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


public class CodexTest_0_6_7 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new StringReader(instances));
      Instance inst = new Instance(2);
      inst.setValue(0, 1.0);
      inst.setValue(1, "A");
      inst.setDataset(model);
      Instance newInst = inst.getAsInstance(model, new Random(42));
      assertEquals(newInst.stringValue(0), "A");
      assertEquals(newInst.value(1), 1.0, EPSILON);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}