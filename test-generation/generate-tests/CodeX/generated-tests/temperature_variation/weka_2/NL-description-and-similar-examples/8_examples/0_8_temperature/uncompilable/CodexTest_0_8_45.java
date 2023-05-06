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


public class CodexTest_0_8_45 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n1,1,1\n2,3,3\n3,3,4\n")));
    Random random = new Random(1);
    AlgVector vector = new AlgVector(new double[]{1.2, 3.4});
    Instance inst = vector.getAsInstance(model, random);
    assertEquals(1.2, inst.value(0), 0.0);
    assertEquals(3.4, inst.value(1), 0.0);
    assertEquals(0.0, inst.value(2), 0.0);
  }

}