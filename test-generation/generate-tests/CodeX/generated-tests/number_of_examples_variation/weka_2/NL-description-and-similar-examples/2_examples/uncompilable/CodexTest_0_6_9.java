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


public class CodexTest_0_6_9 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = TestInstances.makeTestInstances();
    Random random = new Random(1);
    Instance inst = v.getAsInstance(model, random);
    assertEquals("# of attributes differs", model.numAttributes(), inst.numAttributes());
    assertEquals("Dataset differs", model, inst.dataset());
    for (int i = 0; i < model.numAttributes(); i++) {
      if (model.attribute(i).isNumeric()) {
	assertEquals((i+1) + ". value differs", data[i], inst.value(i), 0.0);
      }
      if (model.attribute(i).isNominal()) {
	assertEquals((i+1) + ". value differs", 0, inst.value(i));
      }
    }
  }
}