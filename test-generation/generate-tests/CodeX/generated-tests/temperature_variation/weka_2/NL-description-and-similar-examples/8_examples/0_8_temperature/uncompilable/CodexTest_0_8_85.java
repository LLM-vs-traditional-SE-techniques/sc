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


public class CodexTest_0_8_85 { 
  @Test
  public void testGetAsInstance() {
    Random r = new Random(2);
    double[] vals = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(vals);
    Instances model = makeModel();
    Instance inst = v.getAsInstance(model, r);
    assertTrue(2.3 == inst.value(0));
    assertTrue(1.2 == inst.value(1));
    assertTrue(5.0 == inst.value(2));
    assertTrue(1.0 == inst.value(3));
    assertTrue(2.0 == inst.value(4));
}