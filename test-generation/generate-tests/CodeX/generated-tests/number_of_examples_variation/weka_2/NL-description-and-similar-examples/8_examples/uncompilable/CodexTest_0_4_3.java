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


public class CodexTest_0_4_3 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
								      "a,b,c\n1,2,3\n4,5,6")));
    double[] elements = {1, 2, 3};
    AlgVector v = new AlgVector(elements);
    Instance inst = v.getAsInstance(data, new Random(1));
    assertEquals(1.0, inst.value(0));
    assertEquals(2.0, inst.value(1));
    assertEquals(3.0, inst.value(2));
  }
}