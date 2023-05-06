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


public class CodexTest_0_6_71 { 
  @Test
    public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[] {1.0, 2.0});
    Instances instances = new Instances(new BufferedReader(new StringReader(
      "weather,weather2,temperature\n" +
      "sunny,sunny,high\n" +
      "sunny,overcast,high\n" +
      "sunny,rain,high\n" +
      "overcast,sunny,high\n" +
      "overcast,overcast,high\n" +
      "overcast,rain,high\n" +
      "rain,sunny,high\n" +
      "rain,overcast,high\n" +
      "rain,rain,high\n"
      )), 0);
    Random random = new Random(1);
    Instance instance = v.getAsInstance(instances, random);
    assertNotNull(instance);
    assertEquals("1.0", instance.toString(0));
    assertEquals("0.0", instance.toString(1));
    assertEquals("0.0", instance.toString(2));
  }
}