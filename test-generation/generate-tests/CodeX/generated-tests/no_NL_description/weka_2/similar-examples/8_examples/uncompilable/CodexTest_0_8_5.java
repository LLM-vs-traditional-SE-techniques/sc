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


public class CodexTest_0_8_5 { 
  @Test
   public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(
				      new StringReader(MockInstances.stringArffData)));
    double[] values = ((DenseInstance) model.instance(0)).toDoubleArray();
    AlgVector vector = new AlgVector(values);
    Instance inst = vector.getAsInstance(model, new Random(94748));
    assertNotNull(inst);
    assertEquals("Number of attributes differs", model.numAttributes(), 
		 inst.numAttributes());
    assertEquals("Number of values differs", values.length, 
		 ((DenseInstance) inst).numValues());
    for (int i = 0; i < values.length; i++) {
      assertEquals((i+1) + ". Value differs", values[i], inst.value(i));
    }
    // test string attribute
    model.insertAttributeAt(new Attribute("string_attr"), 0);
    inst = vector.getAsInstance(model, new Random(94748));
    assertTrue(((String) inst.value(0)) != "");
    // test date attribute - ignored
    model.insertAttributeAt(new Attribute("date_attr", "yyyy-MM-dd"), 0);
    inst = vector.getAsInstance(model, new Random(94748));
    assertTrue(((String) inst.value(0)) != "");
    // test relational attribute - ignored
    model.insertAttributeAt(new Attribute("relational_attr", (FastVector) null), 0);
    inst = vector.getAsInstance(model, new Random(94748));
    assertTrue(((String) inst.value(0)) != "");
    // test incompatible numbers of elements
    vector = new AlgVector(values.length+1);
    try {
      inst = vector.getAsInstance(model, new Random(94748));
      fail("Should have thrown an exception since values.length != "
	   + "m_Elements.length");
    } catch (Exception ex) {
      
    }
  }
}