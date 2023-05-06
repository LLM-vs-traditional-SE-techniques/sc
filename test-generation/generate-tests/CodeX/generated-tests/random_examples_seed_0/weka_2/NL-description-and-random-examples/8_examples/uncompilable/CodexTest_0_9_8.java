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


public class CodexTest_0_9_8 { 
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
			if (model.attribute(i).isNominal().equals(true)) {
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
    Output: public void testTest() {
		boolean optional = m_Elements != null;
		Instance newInst = optional ? new DenseInstance(model.numAttributes()) : null;
		newInst.setDataset(model);
        for (int i = 0, j = 0; i < model.numAttributes(); i++) {
			boolean numeric = model.attribute(i).isNumeric();
			boolean numeric2 = numeric ? (j >= m_Elements.length)
				throw new Exception("Datatypes are not compatible.") : true;
}