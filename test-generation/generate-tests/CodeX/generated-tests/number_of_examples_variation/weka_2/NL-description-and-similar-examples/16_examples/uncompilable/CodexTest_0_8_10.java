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


public class CodexTest_0_8_10 { 
  @Test
    public void testGetAsInstance() throws Exception {
    Instances orig = new Instances(new BufferedReader(new FileReader(#TEST_ARFF#)));
    orig.setClassIndex(orig.numAttributes() - 1);
    DenseInstance origInst = (DenseInstance) orig.instance(0);
    Instance inst = origInst.getAsInstance(orig, new Random(42));
    assertTrue(inst instanceof DenseInstance);
    assertEquals(5, inst.numAttributes());
    assertEquals(1.0, inst.value(0), 0.0);
    assertEquals(1.0, inst.value(1), 0.0);
    assertEquals(3.0, origInst.value(1), 0.0);
    assertEquals(2.0, inst.value(2), 0.0);
    assertEquals(-1.0, inst.value(3), 0.0);
    assertEquals(0.0, inst.value(4), 0.0);
  }

}