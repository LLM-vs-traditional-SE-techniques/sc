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


public class CodexTest_0_4_15 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instances model = new Instances(new FastVector(), 0);
    model.insertAttributeAt(new Attribute("A"), 0);
    model.insertAttributeAt(new Attribute("B"), 1);
    model.insertAttributeAt(new Attribute("C"), 2);
    model.insertAttributeAt(new Attribute("D"), 3);
    model.insertAttributeAt(new Attribute("E"), 4);
    model.insertAttributeAt(new Attribute("F"), 5);
    model.insertAttributeAt(new Attribute("G"), 6);
    model.insertAttributeAt(new Attribute("H"), 7);
    model.insertAttributeAt(new Attribute("I"), 8);
    model.insertAttributeAt(new Attribute("J"), 9);
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals(1.0, inst.value(0), 1e-6);
    assertEquals(2.0, inst.value(1), 1e-6);
    assertEquals(3.0, inst.value(2), 1e-6);
    assertEquals(0.0, inst.value(3), 1e-6);
    assertEquals(0.0, inst.value(4), 1e-6);
    assertEquals(0.0, inst.value(5), 1e-6);
    assertEquals(0.0, inst.value(6), 1e-6);
    assertEquals(0.0, inst.value(7), 1e-6);
    assertEquals(0.0, inst.value(8), 1e-6);
    assertEquals(0.0, inst.value(9), 1e-6);
  }
}