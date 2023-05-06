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


public class CodexTest_0_5_31 { 
  @Test
    public void testGetAsInstance() {
    double[] values = {1.5, 2.5, 3.5};
    AlgVector v = new AlgVector(values);
    Instances insts = new Instances(new BufferedReader(new StringReader(
									"@RELATION test\n"
									+ "@ATTRIBUTE attr1 NUMERIC\n"
									+ "@ATTRIBUTE attr2 NUMERIC\n"
									+ "@ATTRIBUTE attr3 NUMERIC\n"
									+ "@DATA\n")));
    try {
      Instance newInst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", 3, newInst.numAttributes());
      assertEquals("Number of values differ", 3, newInst.numValues());
      assertEquals("1. value differs", 1.5, newInst.value(0));
      assertEquals("2. value differs", 2.5, newInst.value(1));
      assertEquals("3. value differs", 3.5, newInst.value(2));
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }
}