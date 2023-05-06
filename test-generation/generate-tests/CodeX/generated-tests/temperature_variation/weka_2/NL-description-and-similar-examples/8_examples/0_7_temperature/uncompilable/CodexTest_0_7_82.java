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


public class CodexTest_0_7_82 { 
  @Test
  public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[] { 1.0, 2.0, 3.0 });
    Instances d = new Instances(new BufferedReader(
        new StringReader(InstancesTest.NOMINAL_HEADER + InstancesTest.NOMINAL_DATA)));
    Instance i = v.getAsInstance(d, new Random(1));
    assertEquals("Wrong class value", "second", i.classValue());
    assertEquals("Wrong instance", "1.0,2.0,3.0,second", i.toString());
    d = new Instances(new BufferedReader(new StringReader(InstancesTest.NUMERIC_HEADER
        + InstancesTest.NUMERIC_DATA)));
    i = v.getAsInstance(d, new Random(1));
    assertEquals("Wrong class value", 0.0, i.classValue(), 1.0E-6);
    assertEquals("Wrong instance", "1.0,2.0,3.0,0.0", i.toString());
    i = v.getAsInstance(d, new Random(4));
    assertEquals("Wrong class value", 1.0, i.classValue(), 1.0E-6);
    assertEquals("Wrong instance", "1.0,2.0,3.0,1.0", i.toString());
  }
}