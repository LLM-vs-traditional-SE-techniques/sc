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


public class CodexTest_0_8_15 { 
  @Test
  public void TestgetAsInstanceInstancesRandom() throws Exception {
    Instances model = TestInstances.createSimpleTestInstances();
    AlgVector i = new AlgVector(2.0, 3.0, 4.0);
    Instance j = i.getAsInstance(model, new Random(100));
    assertEquals(j.numAttributes(), model.numAttributes());
    assertTrue(j.attribute(0).isNumeric());
    assertTrue(j.attribute(1).isNominal());
    assertTrue(j.attribute(2).isNumeric());
    j = i.getAsInstance(model, new Random(1));
    assertTrue(j.attribute(1).isNominal());
    assertEquals(j.value(1), 1.0);
    j = i.getAsInstance(model, new Random(2));
    assertTrue(j.attribute(1).isNominal());
    assertEquals(j.value(1), 2.0);
    j = i.getAsInstance(model, new Random(3));
    assertTrue(j.attribute(1).isNominal());
    assertEquals(j.value(1), 0.0);
    j = i.getAsInstance(model, new Random(4));
    assertTrue(j.attribute(1).isNominal());
    assertEquals(j.value(1), 2.0);
    j = i.getAsInstance(model, new Random(5));
    assertTrue(j.attribute(1).isNominal());
    assertEquals(j.value(1), 2.0);
    j = i.getAsInstance(model, new Random(6));
    assertTrue(j.attribute(1).isNominal());
    assertEquals(j.value(1), 0.0);
    j = i.getAsInstance(model, new Random(7));
    assertTrue(j.attribute(1).isNominal());
    assertEquals(j.value(1), 0.0);
  }
  
  
  Input: public void testNominal() throws Exception {

}