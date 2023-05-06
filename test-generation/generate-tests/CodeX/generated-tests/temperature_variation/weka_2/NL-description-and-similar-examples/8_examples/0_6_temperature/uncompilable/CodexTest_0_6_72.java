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


public class CodexTest_0_6_72 { 
  @Test
  public void testGetAsInstance() {
    Instances insts = new Instances(new StringReader(""
            + "A,B,C\n"
            + "0,0,0\n"
            + "1,1,1\n"
            + "2,2,2\n"
            + "3,3,3\n"));
    AlgVector av = new AlgVector(insts.numAttributes());
    for (int i = 0; i < insts.numAttributes(); i++) {
      av.setElement(i, i);
    }
    Instance inst = null;
    try {
      inst = av.getAsInstance(insts, new Random(1));
    } catch (Exception ex) {
      fail("Unexpected exception: " + ex);
    }
    assertEquals("Different class value", 2, (int) inst.value(0));
    assertEquals("Different class value", 2, (int) inst.value(1));
    assertEquals("Different class value", 2, (int) inst.value(2));
  }
}