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


public class CodexTest_0_9_1 { 
  @Test
  public void testAsInstance() {
    Instances data;
    try {
      data = makeInstances();
      AlgVector v = new AlgVector(new double[]{1.0, 2.0});
      Instance insts = v.getAsInstance(data, new Random(1));
      assertEquals(1.0, insts.value(0));
      assertEquals(1.0, insts.value(1));
      assertEquals(2.0, insts.value(2));
      assertEquals(0.0, insts.value(3));
    } catch (Exception ex) {
      throw new Error(ex.getMessage());
    }
  }
}