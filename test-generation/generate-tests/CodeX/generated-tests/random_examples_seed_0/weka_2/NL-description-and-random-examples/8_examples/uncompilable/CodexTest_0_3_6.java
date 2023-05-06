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


public class CodexTest_0_3_6 { 
  @Test
  public void testGetAsInstance() {
    double[] elements = new double[2];
    elements[0] = 1.0;
    elements[1] = 2.0;
    Instance instance = new Instance(2);
    instance.setValue(0, 1.0);
    instance.setValue(1, 2.0);
    Instances instances = new Instances(new FastVector(), new FastVector());
    instances.add(instance);
    instances.setClassIndex(0);
    Random random = new Random(1);
    Instance newInstance = null;
    try {
      newInstance = new SparseInstance(elements).getAsInstance(instances, random);
    } catch (Exception e) {
      e.printStackTrace();
    }
    assertTrue(newInstance.equals(instance));
  }
}