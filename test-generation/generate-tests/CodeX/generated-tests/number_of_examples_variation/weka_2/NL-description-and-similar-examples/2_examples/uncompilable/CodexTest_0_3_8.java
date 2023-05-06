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


public class CodexTest_0_3_8 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
																	   "A,B,C,D\n" +
																	   "1,2,3,4\n" +
																	   "5,6,7,8\n" +
																	   "9,10,11,12\n" +
																	   "13,14,15,16\n")));
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Length differs", model.numAttributes(), inst.numAttributes());
      assertEquals("Value differs", 2.3, inst.value(0), 1e-6);
      assertEquals("Value differs", 1.2, inst.value(1
}