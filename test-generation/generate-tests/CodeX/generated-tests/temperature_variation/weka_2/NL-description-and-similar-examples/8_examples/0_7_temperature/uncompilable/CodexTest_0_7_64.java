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


public class CodexTest_0_7_64 { 
  @Test
      public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[] {1.1, 2.2, 3.3, 4.4});
    FastVector atts = new FastVector(4);
    atts.addElement(new Attribute("att1"));
    atts.addElement(new Attribute("att2"));
    atts.addElement(new Attribute("att3"));
    atts.addElement(new Attribute("att4"));
    Instances insts = new Instances("test", atts, 0);
    Instance inst = v.getAsInstance(insts, random);
    assertEquals(4, inst.numAttributes());
    assertEquals(1.1, inst.value(0), 1e-12);
    assertEquals(2.2, inst.value(1), 1e-12);
    assertEquals(3.3, inst.value(2), 1e-12);
    assertEquals(4.4, inst.value(3), 1e-12);
  }

}