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


public class CodexTest_0_6_34 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n"
								       + "0,0,\"3\"")));
    data.setClassIndex(data.numAttributes() - 1);
    AlgVector v = new AlgVector(new double[] {1, 2, 3, 4});
    Instance i = v.getAsInstance(data, new Random());
    assertEquals(i.toString(), "1,2,0");
  }
}