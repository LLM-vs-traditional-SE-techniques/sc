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


public class CodexTest_0_5_34 { 
  @Test
  public void testGetAsInstance() throws Exception {
    String[] options = new String[2];
    options[0] = "-M"; options[1] = "0";
    Remove remove = new Remove();
    remove.setOptions(options);
    Instances insts = remove.process(m_Instances);
    AlgVector vector = new AlgVector(insts);
    Instance inst = vector.getAsInstance(insts, new Random(1));
    assertEquals("Num attributes differ", insts.numAttributes(), inst.numAttributes());
    for (int i = 0; i < insts.numAttributes(); i++) {
      assertEquals("Attribute " + i + " differs", insts.attribute(i).isNominal(), inst.attribute(i).isNominal());
      assertEquals("Attribute " + i + " differs", insts.attribute(i).isNumeric(), inst.attribute(i).isNumeric());
      if (insts.attribute(i).isNumeric()) {
	assertEquals("Attribute " + i + " differs", insts.attribute(i).value((int) insts.instance(0).value(i)), inst.attribute(i).value((int) inst.value(i)));
      }
    }
  }
}