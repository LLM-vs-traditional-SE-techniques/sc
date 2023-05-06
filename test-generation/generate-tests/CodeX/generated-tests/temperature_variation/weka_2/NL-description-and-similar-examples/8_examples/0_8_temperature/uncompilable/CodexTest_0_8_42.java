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


public class CodexTest_0_8_42 { 
  @Test
  private void check(Random rand, int num, Instances data) throws Exception {
    AlgVector v = new AlgVector(num, rand);
    Instance inst = v.getAsInstance(data, rand);
    assertEquals("Instances are not equal for seed " + rand.nextInt(), num, inst.numAttributes());
    for (int i = 0; i < num; i++) {
      if (i == 0) {
	assertTrue("Missing class attribute!", inst.classIndex() > 0);
      } else {
	if (inst.attribute(i).isNumeric()) {
	  assertEquals("Instances are not equal for seed " + rand.nextInt(), 
		       v.getElement(i - 1), inst.value(i), 0.00001);
	}
      }
    }
  }
}