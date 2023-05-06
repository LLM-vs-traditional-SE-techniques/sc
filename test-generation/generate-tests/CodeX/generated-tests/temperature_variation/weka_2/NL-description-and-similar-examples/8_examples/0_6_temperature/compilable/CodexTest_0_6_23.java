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


public class CodexTest_0_6_23 { 
  @Test
    public void testGenerateRandomInstance() throws Exception {
    // create a random number generator
    Random random = new Random(42);
    // create a random vector
    AlgVector v = new AlgVector(5);
    for (int i = 0; i < v.numElements(); i++)
      v.setElement(i, random.nextDouble());
    // create a dummy relation
    FastVector atts = new FastVector(5);
    for (int i = 0; i < 5; i++)
      atts.addElement(new Attribute("att" + (i+1)));
    Instances relation = new Instances("Test", atts, 0);
    // generate an instance
    Instance inst = v.getAsInstance(relation, random);
    assertEquals("Number of attributes differs", 5, inst.numAttributes());
    assertEquals("Relation differs", relation, inst.dataset());
    // check values
    for (int i = 0; i < 5; i++)
      assertEquals((i+1) + ". value differs", v.getElement(i), 
		   inst.value(i));
  }
}