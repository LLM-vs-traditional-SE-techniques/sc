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


public class CodexTest_0_9_4 { 
  @Test
  public Instance getAsInstance(Instances model, Random random) 
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
Input: public String representation() {
    StringBuffer result = new StringBuffer();
    result.append(getBaseName(m_Base)).append(*).append(2);
    result.append([);
    for (int i = 0; i < m_BinaryData.length; i++) {
      result.append(m_BinaryData[i] ? 1:0);
    }
    result.append(]);
    return result.toString();
  }
Output: public static void stringReprTest2() {
    int base = 2;
    int pot = 0;
    int numOfVars = 4;
    GrayCode gray = new GrayCode(base, pot, numOfVars, 0);
    System.out.println(gray.representation());
    assertEquals("2*2[0000]", gray.representation());
  }
}