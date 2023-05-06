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


public class CodexTest_0_8_17 { 
  @Test
      public void testGetAsInstanceTypeMismatch() {
	Instances data = new Instances(new BufferedReader(new StringReader(
									   "      @relation test\n      @attribute a numeric\n      @attribute b numeric\n      @data\n      1,1\n    ")));
	AlgVector v = new AlgVector(1);
	try {
	  v.getAsInstance(data, new Random(42));
	} catch (Exception ex) {
	  assertTrue(ex.getMessage().indexOf("Data types are not compatible") == 0);
	  return;
	}
	fail("Should have thrown an exception due to type mismatch.");
      }
	  
Input: public Instance getAsInstance(Instances model, Random random) 
    throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(model.numAttributes());
      newInst.setDataset(model);
            for (int i = 0, j = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  if (j >= m_Elements.length)
	    throw new Exception("Datatypes are not compatible."); 
	  newInst.setValue(i, m_Elements[j++]);
	}
	if (model.attribute(i).isNominal()) {
	  int newVal = (int) 
	    (random.nextDouble() * (double) (model.attribute(i).numValues()));
	  if (newVal == (int) model.attribute(i).numValues())
	    newVal -= 1;
	  newInst.setValue(i, newVal);
	}
      }
    }
    return newInst;
  }
Output:
      public void testGetAsInstance() {
	Instances data = new Instances(new BufferedReader(new StringReader(
									   "      @relation test\n
}