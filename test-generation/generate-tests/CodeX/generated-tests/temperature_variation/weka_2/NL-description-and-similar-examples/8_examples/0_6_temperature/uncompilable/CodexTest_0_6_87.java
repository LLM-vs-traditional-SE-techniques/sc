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


public class CodexTest_0_6_87 { 
  @Test
    public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@relation test\n" +
									"@attribute x numeric\n" +
									"@attribute y numeric\n" +
									"@attribute z numeric\n" +
									"@attribute l {a,b,c}\n" +
									"@data\n")));
    model.setClassIndex(model.numAttributes() - 1);
    AlgVector inst = new AlgVector(3);
    inst.m_Elements[0] = 1.0;
    inst.m_Elements[1] = 2.0;
    inst.m_Elements[2] = 3.0;
    Random random = new Random(1);
    Instance newInst = inst.getAsInstance(model, random);
    assertEquals(newInst.numAttributes(), 4);
    assertEquals(newInst.value(0), 1.0, 0.1);
    assertEquals(newInst.value(1), 2.0, 0.1);
    assertEquals(newInst.value(2), 3.0, 0.1);
    assertEquals(newInst.stringValue(3), "b");
    assertTrue(inst.getAsInstance(model, random) != null);
  }
}