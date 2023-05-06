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


public class CodexTest_0_6_99 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new
						       StringReader(
								    "x,y,z\n" +
								    "1.0,2.0,3.0\n" +
								    "4.0,5.0,6.0\n" +
								    "7.0,8.0,9.0\n")));
    AlgVector v = new AlgVector(3);
    v.setElement(0, 10.0);
    v.setElement(1, 20.0);
    v.setElement(2, 30.0);
    Instance i = v.getAsInstance(model, new Random(1));
    assertEquals(10.0, i.value(0), 0.001);
    assertEquals(20.0, i.value(1), 0.001);
    assertEquals(30.0, i.value(2), 0.001);
  }
}