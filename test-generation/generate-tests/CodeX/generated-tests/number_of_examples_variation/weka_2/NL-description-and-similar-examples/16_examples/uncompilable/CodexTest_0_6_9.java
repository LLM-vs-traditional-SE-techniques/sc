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


public class CodexTest_0_6_9 { 
  @Test
  public void testNumericInstance() {
    Instances data = getData();
    ArrayList<Attribute> atts = new ArrayList<>();
    atts.add(new Attribute("a"));
    atts.add(new Attribute("b"));
    atts.add(new Attribute("c"));
    data.insertAttributeAt(new Attribute("d"), 3);
    data.insertAttributeAt(new Attribute("e"), 4);
    data.insertAttributeAt(new Attribute("f"), 5);
    data.insertAttributeAt(new Attribute("g"), 6);
    data.insertAttributeAt(new Attribute("h"), 7);
    data.add(new DenseInstance(1.0, new double[]{0,0,0,0,0,0,0,0}));
    Random r = new Random(1);
    Instance newInst = data.get(0).getAsInstance(data, r);
    assertTrue(newInst.value(0) > -1);
    assertTrue(newInst.value(0) < 2);
    assertTrue(newInst.value(1) > -1);
    assertTrue(newInst.value(1) < 2);
    assertTrue(newInst.value(2) > -1);
    assertTrue(newInst.value(2) < 2);
    assertTrue(newInst.value(3) == 0);
    assertTrue(newInst.value(4) == 0);
    assertTrue(newInst.value(5) == 0);
    assertTrue(newInst.value(6) == 0);
    assertTrue(newInst.value(7) == 0);
  }
}