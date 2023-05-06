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


public class CodexTest_0_8_18 { 
  @Test
  private static final double DELTA = 0.00001;
  
  public void testGetAsInstance() {
    try {
      int length = 3;
      AlgVector v = new AlgVector(length);
      for (int i = 0; i < length; i++) {
	v.setElement(i, i);
      }
      Instances model = makeHeader();
      Random random = new Random(0);
      Instance inst = v.getAsInstance(model, random);
      assertEquals("Number of values differs", length, inst.numValues());
      for (int i = 0, j = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric())
	  assertEquals("Value #" + j + " differs", v.getElement(j++), inst.value(i), DELTA);
	if (model.attribute(i).isNominal())
	  assertEquals("Value #" + j + " differs", (int)(random.nextDouble() * 
							 (double)(model.attribute(i).numValues()) - 1), (int)(inst.value(i) + 1));
      }
    } catch (Exception e) {
      fail("Exception caught: " + e.toString());
    }
  }
  
  private Instances makeHeader() {
    FastVector attributes = new FastVector();
    Instances result;
    attributes.addElement(new Attribute(a));
    attributes.addElement(new Attribute(b, (FastVector) null));
    attributes.addElement(new Attribute(c));
    result = new Instances(test, attributes, 0);
    return result;
  }
}