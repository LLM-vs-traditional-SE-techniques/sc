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


public class CodexTest_0_4_42 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(new double[]{2.3, 1.2, 5.0});
    Instances data = new Instances(new BufferedReader(new StringReader(
								      "A,B,C\n"
								      + "1,2,3\n"
								      + "4,5,6\n"
								      + "7,8,9\n")));
    Random random = new Random(1);
    Instance inst = v.getAsInstance(data, random);
    assertEquals("Instance has wrong number of attributes",
		 data.numAttributes(), inst.numAttributes());
    assertEquals("Instance has wrong number of values",
		 data.numAttributes(), inst.numValues());
    assertEquals("Instance has wrong class value",
		 1, (int) inst.classValue());
    assertEquals("Instance has wrong value for attribute A",
		 2.3, inst.value(0));
    assertEquals("Instance has wrong value for attribute B",
		 1.2, inst.value(1));
    assertEquals("Instance has wrong value for attribute C",
		 5.0, inst.value(2));
  }
}