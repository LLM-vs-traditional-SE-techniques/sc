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


public class CodexTest_0_6_7 { 
  @Test
    public void testGetAsInstance() throws Exception {
    Random random = new Random(1);
    AlgVector v = new AlgVector(2);
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    Instances i = new Instances(new BufferedReader(new StringReader(
								     "a,b\n1,2\n3,4")));
    Instance newInst = v.getAsInstance(i, random);
    assertEquals(2, newInst.numValues());
    assertEquals(1.0, newInst.value(0), 0.0);
    assertEquals(2.0, newInst.value(1), 0.0);
  }
}