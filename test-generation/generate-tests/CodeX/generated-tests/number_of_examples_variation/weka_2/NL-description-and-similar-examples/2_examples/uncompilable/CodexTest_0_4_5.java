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


public class CodexTest_0_4_5 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances inst = new Instances(new BufferedReader(new StringReader(
								       "nominal,numeric\n" +
								       "a,1\n" +
								       "b,2\n" +
								       "c,3\n" +
								       "d,4\n" +
								       "e,5\n" +
								       "f,6\n" +
								       "g,7\n" +
								       "h,8\n" +
								       "i,9\n" +
								       "j,10")));
    Random random = new Random(1);
    Instance newInst = v.getAsInstance(inst, random);
    assertEquals("Wrong number of attributes",
}