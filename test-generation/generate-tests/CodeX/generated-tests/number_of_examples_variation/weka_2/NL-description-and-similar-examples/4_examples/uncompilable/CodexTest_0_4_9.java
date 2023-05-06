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


public class CodexTest_0_4_9 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances dataset = new Instances(new BufferedReader(new StringReader(
									  "nom,nom2,num\n" +
									  "a,b,1.0\n" +
									  "c,d,2.0\n" +
									  "e,f,3.0")));
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instance newInst = v.getAsInstance(dataset, new Random(42));
    assertEquals("Nominal value differs", "a", newInst.stringValue(0));
    assertEquals("Nominal value differs", "b", newInst.stringValue(1));
    assertEquals("Numeric value differs", 1.0, newInst.value(2), 1e-6);
  }
}