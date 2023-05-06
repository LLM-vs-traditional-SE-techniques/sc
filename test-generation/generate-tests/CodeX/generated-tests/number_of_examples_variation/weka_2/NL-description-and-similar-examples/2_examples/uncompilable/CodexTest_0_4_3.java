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


public class CodexTest_0_4_3 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@relation Test\n" +
									"@attribute a1 numeric\n" +
									"@attribute a2 numeric\n" +
									"@attribute a3 numeric\n" +
									"@attribute a4 {a, b, c}\n" +
									"@data\n")));
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differs", model.numAttributes(), inst.numAttributes());
      assertEquals("Number of values differs", model.numAttributes(), inst.numValues());
      assertEquals("a1 differs", data[0], inst.value(0));
      assertEquals("a2 differs", data[1], inst.value(1));
      assertEquals("a3 differs", data[
}