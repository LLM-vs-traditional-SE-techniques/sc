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


public class CodexTest_0_4_7 { 
  @Test
  public void testGetAsInstance_Nominal() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
        "@relation Test\n"
        + "@attribute A {A,B}\n"
        + "@attribute B {C,D}\n"
        + "@data\n")));
    model.setClassIndex(0);
    Instance inst = new DenseInstance(1.0, new double[0]);
    inst.setDataset(model);
    Random random = new Random(1);
    Instance newInst = inst.getAsInstance(model, random);
    assertEquals("A", newInst.stringValue(0));
    assertEquals("C", newInst.stringValue(1));
  }

}