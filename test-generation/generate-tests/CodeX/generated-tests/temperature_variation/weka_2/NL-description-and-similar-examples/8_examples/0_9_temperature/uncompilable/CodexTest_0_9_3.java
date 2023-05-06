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
    public void testNominalTypesWithExample() {
    double[] data = {0, 1, 2};
    int precision = 3;
    FastVector nominal = new FastVector(new int[]{0,1,precision});
    nominal.addElement("0");
    nominal.addElement("1");
    nominal.addElement("unknown");
    Attribute attr1 = new Attribute("numeric", 
                                           new int[]{0, 1, precision}, 0);
    Attribute attr2 = new Attribute("nominal", nominal, 1);
    FastVector attributes = new FastVector(2);
    attributes.addElement(attr1);
    attributes.addElement(attr2);
    Instances insts = new Instances("test", attributes, 0);
    insts.add(new Instance(2));
    insts.setClassIndex(1);
    AlgVector algVec = new AlgVector(data);
    Instance inst = algVec.getAsInstance(insts);
    assertTrue(inst != null);
    assertEquals(2, inst.numAttributes());
    assertTrue(inst.classAttribute().isNominal());
    assertTrue(inst.classAttribute().numValues() == 3);
    assertTrue(inst.classAttribute().indexOfValue("1") == 1);
    assertTrue(inst.classAttribute().indexOfValue("0") == 0);
    assertEquals(1, inst.classValue());
  }
}