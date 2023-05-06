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


public class CodexTest_0_6_47 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
        "a,b,c,d,e\n" + "1,2,3,4,5\n" + "6,7,8,9,10\n" + "11,12,13,14,15")));
    model.setClassIndex(model.numAttributes() - 1);
    AlgVector v = new AlgVector(new double[] { 1, 2, 3, 4, 5 });
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals(5, inst.numAttributes());
    for (int i = 0; i < model.numAttributes(); i++) {
      assertEquals(i + 1, inst.value(i), 0.0);
    }
  }
}