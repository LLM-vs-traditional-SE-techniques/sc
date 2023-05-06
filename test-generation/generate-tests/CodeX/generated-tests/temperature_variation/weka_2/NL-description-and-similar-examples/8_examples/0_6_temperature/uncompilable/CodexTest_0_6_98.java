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


public class CodexTest_0_6_98 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] data = {1.0, 2.0, 3.0, 4.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
								      "@RELATION test\n" +
								      "\n" +
								      "@ATTRIBUTE att1 numeric\n" +
								      "@ATTRIBUTE att2 numeric\n" +
								      "@ATTRIBUTE att3 numeric\n" +
								      "@ATTRIBUTE att4 numeric\n" +
								      "@ATTRIBUTE att5 numeric\n" +
								      "\n" +
								      "@DATA\n")));
    Random random = new Random(1);
    Instance inst = v.getAsInstance(model, random);
    assertEquals(data.length, inst.numAttributes());
    for (int i = 0; i < data.length; i++)
      assertEquals(data[i], inst.value(i), 0.0);
  }
}