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


public class CodexTest_0_3_9 { 
  @Test
    public void testGetAsInstance() {
    double[] vals = new double[2];
    vals[0] = 1;
    vals[1] = 2;
    AlgVector v = new AlgVector(vals);
    Instances insts = new Instances(new BufferedReader(new StringReader(
      "a,b,c\n1,2,3\n4,5,6\n7,8,9")));
    Instance inst = v.getAsInstance(insts, new Random(1));
    assertEquals(1, inst.value(0));
    assertEquals(2, inst.value(1));
    assertEquals(2, inst.value(2));
  }
}