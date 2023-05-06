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


public class CodexTest_0_8_2 { 
  @Test
    /**
     * Test missing values
     */
    public void testMissing() {
      try {
	String dataset = "sunspot.arff";
	Instances train = new Instances(new BufferedReader(
					 new FileReader(dataset)));
	train.setClassIndex(train.numAttributes() - 1);
	FastVector values = new FastVector();
	for (int i = 0; i < train.numAttributes(); i++) {
	  if (i == train.classIndex()) {
	    continue;
	  }
	  values.addElement("-1.0");
	}
	Instance inst = new DenseInstance(1.0, values);
	inst.setDataset(train);
	Instance instWithMissing = 
	  (Instance)inst.copy(new Instances(train, 0));
	instWithMissing.setMissing(0);
	inst.replaceMissingValues(instWithMissing);
	assertEquals("Difference from expected missing value", 
		     inst.missingValue(), inst.value(0));
      } catch (Exception e) {
	fail("Problem setting up to test replacing missing values: " + e);
      }
    }
}