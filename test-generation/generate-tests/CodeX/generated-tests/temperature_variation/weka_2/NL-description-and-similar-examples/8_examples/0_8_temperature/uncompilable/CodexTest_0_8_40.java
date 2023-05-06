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


public class CodexTest_0_8_40 { 
  @Test
                                 public void testGetAsInstance() {
    Instances inst = new Instances(new StringReader(m_Data));
    AlgVector v = new AlgVector(inst);
    Instance newInst = v.getAsInstance(inst);
    assertEquals("Datatypes are not compatible.", inst.numAttributes(), newInst.numAttributes());
    for (int i = 0; i < inst.numAttributes(); i++) {
      if (inst.attribute(i).isNumeric())
	assertEquals("Datatypes are not compatible.", inst.attribute(i).value(0), newInst.value(i));
      if (inst.attribute(i).isNominal())
	assertTrue("Datatypes are not compatible.", newInst.value(i) >= 0);
    }
  }
}