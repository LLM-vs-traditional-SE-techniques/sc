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


public class CodexTest_0_2_8 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
      Instances model = new Instances(new BufferedReader(
					new StringReader(
					"@relation Test\n" +
					"@attribute A numeric\n" +
					"@attribute B numeric\n" +
					"@attribute C numeric\n" +
					"@data\n" +
					"1.0, 2.0, 3.0\n" +
					"4.0, 5.0, 6.0\n")));
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Length differs", 3, inst.numAttributes());
      assertEquals("1. value differs", 1.0, inst.value(0));
      assertEquals("2. value differs", 2.0, inst.value(1));
      assertEquals("3. value differs", 3.0, inst.value(2));
    }
    catch (Exception e) {

}