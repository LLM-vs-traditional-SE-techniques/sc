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


public class CodexTest_0_4_55 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(
				     new StringReader(
				     "E,F,G\n" +
				     "0,1,2\n" +
				     "0,1,2")));
    double[] data = {0.0, 1.0, 2.0};
    AlgVector v = new AlgVector(data);
    Instance i = v.getAsInstance(model, new Random(1));
    assertEquals("Num attributes differs", model.numAttributes(),
		 i.numAttributes());
    assertEquals("Num values differs", model.numAttributes(),
		 i.numValues());
    assertEquals("Value differs", 0.0, i.value(0));
    assertEquals("Value differs", 1.0, i.value(1));
    assertEquals("Value differs", 2.0, i.value(2));
  }
}