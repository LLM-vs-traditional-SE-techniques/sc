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


public class CodexTest_0_6_82 { 
  @Test
  public void testToInstance() {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instances header = new Instances(new Instance(3), 0);
    header.setClassIndex(2);
    header.setClassIndex(1);
    Instance inst = v.getAsInstance(header, new Random(3));
    assertEquals(3, inst.numValues());
    assertEquals(1.0, inst.value(0), 0.00001);
    assertEquals(2.0, inst.value(1), 0.00001);
    assertEquals(3.0, inst.value(2), 0.00001);
  }
}