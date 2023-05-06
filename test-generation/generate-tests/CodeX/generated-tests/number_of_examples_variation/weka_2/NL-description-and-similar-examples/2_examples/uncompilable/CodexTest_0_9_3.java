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


public class CodexTest_0_9_3 { 
  @Test
    public void testGetAsInstance() throws Exception {
    AlgVector a = new AlgVector(new double[] {2.3, 5.0});
    int num = 10;
    FastVector atts = new FastVector(num);
    for (int i = 0; i < num; i++)
      atts.addElement(new Attribute("Att_" + (i+1)));
    Instances inst = new Instances(Rel, atts, 1);
    inst.add(new Instance(1.0, new double[] {2.3, 5.0, 0, 0, 0, 0, 0, 0, 0, 0}));
    Instance newInst = a.getAsInstance(inst, new Random());
    assertEquals("Number of attributes differs", num, 
		 newInst.numAttributes());
    assertEquals("Number of values differs", num, newInst.numValues());
    assertEquals("The 1st value differs", 2.3, newInst.value(0));
    assertEquals("The 2nd value differs", 5.0, newInst.value(1));
    newInst = a.getAsInstance(inst, new Random());
    assertEquals("Number of attributes differs", num, 
		 newInst.numAttributes());
    assert
}