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


public class CodexTest_0_5_86 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    FastVector atts = new FastVector(3);
    atts.addElement(new Attribute("att1"));
    atts.addElement(new Attribute("att2"));
    atts.addElement(new Attribute("att3"));
    Instances ins = new Instances("test", atts, 0);
    Instance newInst = v.getAsInstance(ins, new Random(1));
    assertEquals(3, newInst.numAttributes());
    assertEquals(2.3, newInst.value(0), 0.001);
    assertEquals(1.2, newInst.value(1), 0.001);
    assertEquals(5.0, newInst.value(2), 0.001);
  }
}