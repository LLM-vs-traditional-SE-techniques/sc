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


public class CodexTest_0_0_2 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "@relation test\n" +
									  "@attribute a numeric\n" +
									  "@attribute b numeric\n" +
									  "@attribute c numeric\n" +
									  "@data\n" +
									  "1.0, 2.0, 3.0\n" +
									  "4.0, 5.0, 6.0\n" +
									  "7.0, 8.0, 9.0\n")));
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differs", model.numAttributes(), 
		   inst.numAttributes());
      assertEquals("Number of values differs", model.numAttributes(), 
		  
}