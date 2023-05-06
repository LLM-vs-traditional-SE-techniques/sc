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


public class CodexTest_0_6_20 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
		  "@relation \"test\"\n" +
		  "@attribute att1 numeric\n" +
		  "@attribute att2 numeric\n" +
		  "@attribute att3 numeric\n" +
		  "@data\n" +
		  "1, 2, 3\n" +
		  "4, 5, 6\n" +
		  "7, 8, 9\n" +
		  "10, 11, 12\n" +
		  "13, 14, 15\n")));
    Instance newInst = v.getAsInstance(model, new Random(1));
    assertEquals("Length differs", data.length, newInst.numAttributes());
    for (int i = 0; i < data.length; i++)
      assertEquals((i+1) + ". value differs", data[i], newInst.value(i));
  }
}