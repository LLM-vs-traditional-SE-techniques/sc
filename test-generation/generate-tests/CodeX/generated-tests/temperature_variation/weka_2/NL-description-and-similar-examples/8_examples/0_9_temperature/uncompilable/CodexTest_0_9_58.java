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


public class CodexTest_0_9_58 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(new double[]{Math.PI, Math.E});
    Instances inst = new Instances(new StringReader(AlgVector.ALGAL_ATTR_DECL));
    Instance inst1 = v.getAsInstance(inst, new Random());
    assertEquals("Values differ", Math.PI, inst1.value(0));
    assertEquals("Values differ", Math.E, inst1.value(1));
  }

}