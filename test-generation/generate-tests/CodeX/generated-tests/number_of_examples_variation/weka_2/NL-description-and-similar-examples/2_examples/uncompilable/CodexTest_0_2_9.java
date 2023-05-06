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


public class CodexTest_0_2_9 { 
  @Test
  public void testGetAsInstance() {
    try {
      double[] data = {2.3, 1.2, 5.0};
      AlgVector v = new AlgVector(data);
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "@relation Test\n" +
									  "@attribute a numeric\n" +
									  "@attribute b numeric\n" +
									  "@attribute c numeric\n" +
									  "@data\n" +
									  "1.0,2.0,3.0\n" +
									  "4.0,5.0,6.0\n" +
									  "7.0,8.0,9.0\n")));
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Length differs", data.length, inst.numAttributes());
      for (int i = 0; i < data.length; i++)
	assertEquals
}