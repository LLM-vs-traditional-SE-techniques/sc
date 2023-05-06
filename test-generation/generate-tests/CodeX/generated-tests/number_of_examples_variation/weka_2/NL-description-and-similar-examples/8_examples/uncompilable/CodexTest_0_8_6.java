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


public class CodexTest_0_8_6 { 
  @Test
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
Output: public void testGetAsInstance() {
			m_Elements = new double[]{1.0, 2.0};
			Instances model = createInstances();
			// set up a random number generator that returns 1
			Random rand = new Random();
			rand.setSeed(1);
			double[][] test = {{1.0, 0.0}};
			Instance inst = getAsInstance(model, rand);
			m_Elements = null;
			assertEquals(1, inst.numAttributes());
			assertEquals(0.0, inst.value(0));
		}
}