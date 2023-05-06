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


public class CodexTest_0_8_3 { 
  @Test
  public void testVectorToInstance() throws Exception {
    Instances data = TestInstances.createRandomInstances(10);
    data.setClassIndex(4);
    DenseInstance inst = new DenseInstance(5);
    inst.setValue(0, 3);
    inst.setValue(1, -1);
    inst.setValue(2, 0.5);
    inst.setValue(3, 22.7);
    inst.setValue(4, "class1");
    AlgVector vec = new AlgVector(inst);
    assertEquals("Instance converted to vector and then back differs", inst, vec.getAsInstance(data, new Random(1)));
  }
}