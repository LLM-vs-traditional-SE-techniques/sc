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


public class CodexTest_0_2_54 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 1;
    int numNumeric = 2;
    int numNominal = 1;
    int numValues = 4;
    int numElements = 2;
    double[] elements = {1.0, 2.0};
    Instances model = new Instances("test", 
				    new ArrayList<Attribute>(), 
				    numInstances);
    for (int i = 0; i < numNumeric; i++) {
      model.insertAttributeAt(new Attribute("Numeric" + (i+1)), i);
    }
    for (int i = 0; i < numNominal; i++) {
      model.insertAttributeAt(new Attribute("Nominal" + (i+1), 
					    new ArrayList<String>()), 
			       i + numNumeric);
      for (int n = 0; n < numValues; n++) {
	model.attribute(i + numNumeric).addStringValue("Value" + (n+1));
      }
    }
    AlgVector vector = new AlgVector(elements);
    try {
      Instance newInst = vector.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differ", 
		   numAttributes, newInst.numAttributes());
      assertEquals("Number of values differ", 
		   numAttributes, newInst.numValues());
      for (int i = 0; i < numNumeric; i++) {
	assertEquals("Numeric value differs", 
		     elements[i], newInst.value(i), 0.0);
      }
      for (int i = 0; i < numNominal; i++) {
	assertEquals("Nominal value differs", 
		     "Value" + (int)(newInst.value(i + numNumeric) + 1), 
		     newInst.stringValue(i + numNumeric));
      }
    } catch (Exception e)
}