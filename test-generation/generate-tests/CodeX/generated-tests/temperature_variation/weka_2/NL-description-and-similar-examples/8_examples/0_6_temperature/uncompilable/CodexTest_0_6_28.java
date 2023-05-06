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


public class CodexTest_0_6_28 { 
  @Test
  public void testGetAsInstanceWithNoncompatibleDataTypes() {
    DenseInstance instance = new DenseInstance(2);
    Instances instances = new Instances(new Instances(1), 0);
    instances.add(new Attribute("A"));
    instances.add(new Attribute("B", (ArrayList) null));
    instance.setDataset(instances);
    instance.setValue(0, 1.0);
    instance.setValue(1, "A");
    Random random = new Random(1);
    AlgVector vector = new AlgVector(2);
    try {
      vector.getAsInstance(instances, random);
      fail("Exception expected!");
    } catch (Exception ex) {
      // expected
    }
  }
}