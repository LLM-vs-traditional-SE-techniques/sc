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


public class CodexTest_0_9_2 { 
  @Test
  public void testGetAsInstance() throws Exception {
    JUnit.startTest("Creating Instance");
    Instances model = new Instances(new StringReader(
				       NOMINAL_INSTANCE));
    assertTrue(model.attribute(3).isNominal());
    AlgVector vec = new AlgVector(new double[] {1, 2, 3, 4, 5});
    assertEquals("Length differs.", 5, vec.numElements());
    Instance inst = vec.getAsInstance(model, new Random(42));
    assertEquals("# of atts differs.", 5, inst.numAttributes());
    assertEquals("Index of m_Elements differs.", 0, inst.index(3));
    assertTrue("Attribute is not nominal.", inst.attribute(3).isNominal());
    assertEquals("Nominal # differs.", 2, inst.attribute(3).numValues());
    assertEquals("Value differs.", 1, inst.value(3));
  }
}