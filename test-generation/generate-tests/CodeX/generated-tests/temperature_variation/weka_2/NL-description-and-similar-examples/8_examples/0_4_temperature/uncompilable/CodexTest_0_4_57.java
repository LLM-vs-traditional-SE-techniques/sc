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


public class CodexTest_0_4_57 { 
  @Test
  public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
    Instances i = new Instances(new BufferedReader(new StringReader(
								     "@relation Test\n" +
								     "@attribute a numeric\n" +
								     "@attribute b numeric\n" +
								     "@attribute c numeric\n" +
								     "@attribute d numeric\n" +
								     "@data\n" +
								     "1,2,3,4\n" +
								     "5,6,7,8\n" +
								     "9,10,11,12\n")));
    Instance inst = v.getAsInstance(i, new Random(0));
    assertEquals(1.0, inst.value(0));
    assertEquals(2.0, inst.value(1));
    assertEquals(3.0, inst.value(2));
    assertEquals(0.0, inst.value(3));
  }
}