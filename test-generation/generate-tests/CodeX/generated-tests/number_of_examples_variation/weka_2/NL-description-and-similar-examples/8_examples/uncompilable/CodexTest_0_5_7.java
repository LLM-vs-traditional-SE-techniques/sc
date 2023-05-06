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


public class CodexTest_0_5_7 { 
  @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(1,2,3);
        Instances inst = new Instances(m_Instances, 0);
        Instance inst2 = null;
        try {
            inst2 = v.getAsInstance(inst, new Random(1));
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Exception thrown on getAsInstance: " + ex.getMessage());
        }
        assertEquals("Number of values differs", 1, inst2.numValues());
        assertEquals("Value differs", 1, inst2.value(0), 1e-6);
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
        AlgVector v = new AlgVector(1,2,3);
        Instances inst = new Instances(m_Instances, 0);
        Instance inst2 = null;
        try {
            inst2 = v
}