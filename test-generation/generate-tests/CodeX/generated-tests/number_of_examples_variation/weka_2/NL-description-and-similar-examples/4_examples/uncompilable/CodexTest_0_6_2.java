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


public class CodexTest_0_6_2 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 21;
    int numValues = 100;
    int[] attIndices = {1, 4, 7, 10, 13, 16, 19};
    int length = attIndices.length;
    String name = "Test";
    String relName = "Relation";
    FastVector atts = new FastVector();
    FastVector attVals = new FastVector();
    for (int i = 0; i < numAttributes; i++) {
      if (Arrays.binarySearch(attIndices, i) >= 0) {
	atts.addElement(new Attribute(name + (i+1)));
      } else {
	for (int n = 0; n < numValues; n++)
	  attVals.addElement(name + (i+1) + _ + (n+1));
	atts.addElement(new Attribute(name + (i+1), attVals));
	attVals = new FastVector();
      }
    }
    Instances model = new Instances(relName, atts, 0);
    AlgVector v = new AlgVector(length);
    for (int i = 0; i < length; i++)
      v.setElement(i, (double) i);
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals(numAttributes, inst.numAttributes());
      for (int i = 0; i < length; i++)
	assertEquals(i, inst.value(attIndices[i]), 1e-6);
      for (int i = 0; i < numAttributes; i++) {
	if (Arrays.binarySearch(attIndices, i) >= 0)
	  continue;
	assertEquals(name + (i+1) + _ + (int)inst.value(i) + 1, 
		     inst.stringValue(i));
      }
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e.getMessage());
    }
  }
}