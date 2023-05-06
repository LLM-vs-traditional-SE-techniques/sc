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


public class CodexTest_0_4_39 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n"
								       + "0,0,0\n"
								       + "0,1,1\n"
								       + "1,0,1\n"
								       + "1,1,0\n"
								       + "1,1,1\n"
								       + "1,1,2\n")));
    double[] values = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(values);
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals("A", inst.stringValue(0));
    assertEquals("1", inst.stringValue(1));
    assertEquals("1", inst.stringValue(2));
  }
}