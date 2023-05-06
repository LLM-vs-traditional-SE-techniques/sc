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


public class CodexTest_0_4_92 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
        "Relation Test\n" +
        "NumAttributes 4\n" +
        "NumInstances 1\n" +
        "Attribute one numeric\n" +
        "Attribute two numeric\n" +
        "Attribute three numeric\n" +
        "Attribute four numeric\n" +
        "Data\n" +
        "1.0,2.0,3.0,4.0\n")));
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0, 4.0});
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals(1.0, inst.value(0), 1e-6);
    assertEquals(2.0, inst.value(1), 1e-6);
    assertEquals(3.0, inst.value(2), 1e-6);
    assertEquals(4.0, inst.value(3), 1e-6);
  }
}