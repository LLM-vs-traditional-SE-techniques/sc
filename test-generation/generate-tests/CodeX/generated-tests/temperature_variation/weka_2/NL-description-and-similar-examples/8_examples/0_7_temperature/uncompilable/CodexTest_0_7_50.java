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


public class CodexTest_0_7_50 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 5;
    FastVector attInfo = new FastVector(numAtts);
    attInfo.addElement(new Attribute("anNominal"));
    attInfo.addElement(new Attribute("aNumeric"));
    attInfo.addElement(new Attribute("anNominal"));
    attInfo.addElement(new Attribute("anotherNominal"));
    attInfo.addElement(new Attribute("andAnotherNominal"));
    Instances insts = new Instances("a", attInfo, 0);
    AlgVector av = new AlgVector(insts.numAttributes());
    av.setElement(1, 1.1);
    av.setElement(3, 7.0);
    Random random = new Random(1);
    Instance inst = av.getAsInstance(insts, random);
    assertEquals("anNominal", inst.stringValue(0));
    assertEquals(1.1, inst.value(1), 1e-6);
    assertEquals("anNominal", inst.stringValue(2));
    assertEquals(7.0, inst.value(3), 1e-6);
    assertEquals("andAnotherNominal", inst.stringValue(4));
  }
}