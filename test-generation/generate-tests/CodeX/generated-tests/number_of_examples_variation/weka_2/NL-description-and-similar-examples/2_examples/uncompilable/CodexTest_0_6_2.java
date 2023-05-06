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


public class CodexTest_0_6_2 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(
					new StringReader(
					  "F1,F2,F3,F4,F5\n" + 
					  "1,3,3,3,3\n" + 
					  "2,2,2,2,2\n" +
					  "3,1,1,1,1\n")));
      AlgVector v = new AlgVector(new double[]{2.2,2.2,2.2,2.2,2.2});
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Values differ", 2.2, inst.value(0));
      assertEquals("Values differ", 2.2, inst.value(1));
      assertEquals("Values differ", 2.2, inst.value(2));
      assertEquals("Values differ", 2.2, inst.value(3));
      assertEquals("Values differ", 2.2, inst.value(4));
    } catch (Exception e) {
      e.printStackTrace();
      fail
}