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


public class CodexTest_0_7_30 { 
  @Test
    public void testNumericToInstance() {
    int size = 3;
    AlgVector v = new AlgVector(size);
    v.m_Elements[0] = 0.1;
    v.m_Elements[1] = 0.2;
    v.m_Elements[2] = 1.0;
    Instances inst = new Instances(new FastVector(), 0);
    inst.insertAttributeAt(new Attribute("numeric"), 0);
    inst.insertAttributeAt(new Attribute("numeric"), 1);
    inst.insertAttributeAt(new Attribute("numeric"), 2);
    Instance i = v.getAsInstance(inst, new Random(0));
    assertEquals("Numeric value differs", 0.1, i.value(0), 0);
    assertEquals("Numeric value differs", 0.2, i.value(1), 0);
    assertEquals("Numeric value differs", 1.0, i.value(2), 0);
  }
}