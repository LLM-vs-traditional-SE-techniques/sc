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


public class CodexTest_0_7_97 { 
  @Test
    public void testGetAsInstance() throws Exception {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances i = new Instances(new BufferedReader(new StringReader(
								      "Dummy\n" +
								      "@relation test\n" +
								      "@attribute A numeric\n" +
								      "@attribute B numeric\n" +
								      "@attribute C numeric\n" +
								      "@attribute D numeric\n")));
    Instance inst = v.getAsInstance(i, new Random(1));
    assertEquals("Num of attributes differs", i.numAttributes(), inst.numAttributes());
    for (int j = 0; j < i.numAttributes(); j++) {
      if (i.attribute(j).isNumeric())
	assertEquals((j+1) + ". value differs", data[j], inst.value(j), 1e-6);
    }
  }
}