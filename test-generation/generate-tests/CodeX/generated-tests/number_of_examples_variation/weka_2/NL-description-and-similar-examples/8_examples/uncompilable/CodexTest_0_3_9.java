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


public class CodexTest_0_3_9 { 
  @Test
  public void testNumAttributes() {
    int numAttributes = 3;
    Instances model = new Instances("test", new ArrayList<Attribute>(numAttributes), 0);
    for (int i = 0; i < numAttributes; i++) {
      model.insertAttributeAt(new Attribute("att" + i), i);
    }
    AlgVector vector = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instance instance = vector.getAsInstance(model, new Random(1));
    assertEquals("Wrong number of attributes", numAttributes, instance.numAttributes());
  }
}