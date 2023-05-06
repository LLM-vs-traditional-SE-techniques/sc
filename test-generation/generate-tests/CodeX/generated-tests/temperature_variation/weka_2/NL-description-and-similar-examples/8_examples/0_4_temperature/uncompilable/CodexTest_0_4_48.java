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


public class CodexTest_0_4_48 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int numAttributes = 3;
    double[] values = {1.0, 2.0, 3.0};
    Instances model = new Instances("test", 
				    new ArrayList<Attribute>(), numAttributes);
    model.add(new Attribute("att1"));
    model.add(new Attribute("att2"));
    model.add(new Attribute("att3"));
    AlgVector v = new AlgVector(values);
    Instance newInst = v.getAsInstance(model, new Random(1));
    assertEquals("Number of attributes differ", numAttributes, 
		 newInst.numAttributes());
    for (int i = 0; i < numAttributes; i++)
      assertEquals("Values differ", values[i], newInst.value(i), 1e-6);
  }
}