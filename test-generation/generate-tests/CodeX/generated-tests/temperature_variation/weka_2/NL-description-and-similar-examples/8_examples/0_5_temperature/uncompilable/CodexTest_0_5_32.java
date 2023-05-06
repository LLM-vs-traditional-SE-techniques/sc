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


public class CodexTest_0_5_32 { 
  @Test
    public void testGetAsInstance() {
    int numAttributes = 3;
    int numValues = 3;
    Random random = new Random(0);
    Instances model = new Instances("Test", 
				    new ArrayList<Attribute>(), 
				    numAttributes);
    for (int i = 0; i < numAttributes; i++) {
      model.insertAttributeAt(new Attribute("Att" + (i+1)), i);
    }
    model.insertAttributeAt(new Attribute("Class", 
					  Arrays.asList(new String[]{"A", "B", "C"})), 
			    numAttributes);
    model.setClassIndex(numAttributes);
    double[] values = new double[]{1, 2, 3};
    AlgVector v = new AlgVector(values);
    Instance inst = v.getAsInstance(model, random);
    assertEquals(numAttributes, inst.numAttributes());
    assertEquals(numValues, inst.classAttribute().numValues());
    assertEquals(1.0, inst.value(0), 0.0);
    assertEquals(2.0, inst.value(1), 0.0);
    assertEquals(3.0, inst.value(2), 0.0);
    assertEquals(0, inst.classValue());
  }
}