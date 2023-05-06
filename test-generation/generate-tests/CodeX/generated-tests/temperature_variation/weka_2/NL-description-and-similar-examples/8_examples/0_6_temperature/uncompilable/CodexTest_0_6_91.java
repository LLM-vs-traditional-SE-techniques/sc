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


public class CodexTest_0_6_91 { 
  @Test
    /**
     * Tests the getAsInstance method.
     */
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances inst = new Instances(new FastVector(), 0);
			for (int i=0; i<data.length; i++) {
			  inst.insertAttributeAt(new Attribute("NumAttr"+i), i);
			}
			inst.insertAttributeAt(new Attribute("NomAttr"), data.length);
			inst.insertAttributeAt(new Attribute("NomAttr"), data.length+1);
			Random random = new Random(1);
			try {
			  Instance instV = v.getAsInstance(inst, random);
			  assertEquals("Number of attributes differ.", 
				       inst.numAttributes(), 
				       instV.numAttributes());
			  for (int i=0; i<data.length; i++) {
			    assertEquals("Value "+i+" differs.", data[i], 
					 instV.value(i), 0);
			  }
			} catch (Exception ex) {
			  fail("Exception occured when generating instance.");
			}
		  }
}