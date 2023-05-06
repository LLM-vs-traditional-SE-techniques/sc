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


public class CodexTest_0_7_37 { 
  @Test
    public void testGetAsInstance() {
      int n = 5;
      int w = 2;
      int h = 2;
      AlgVector v = new AlgVector(n);
      for (int i = 0; i < n; i++)
	v.setElement(i, i);
      Instances model = new Instances(new StringReader(
						       "a,a,b\n" +
						       "0.1,0.2,a\n" +
						       "0.3,0.4,b\n" +
						       "0.5,0.6,c\n" +
						       "0.7,0.8,c\n" +
						       "0.9,1.0,c"));
      Random random = new Random();
      Instance newInstance = v.getAsInstance(model, random);
      assertEquals(model.numAttributes(), newInstance.numAttributes());
      assertEquals(n, newInstance.numValues());
    }
}