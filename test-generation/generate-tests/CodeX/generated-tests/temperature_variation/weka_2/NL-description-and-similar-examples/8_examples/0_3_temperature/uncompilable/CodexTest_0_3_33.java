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


public class CodexTest_0_3_33 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances insts = new Instances(new BufferedReader(new StringReader(
									  InstancesTest.simpleData)));
      AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", insts.numAttributes(), inst.numAttributes());
      assertEquals("Number of values differ", insts.numAttributes(), inst.numValues());
      assertEquals("Dataset differs", insts, inst.dataset());
      assertEquals("Class value differs", insts.classIndex(), inst.classValue());
      assertEquals("Class attribute differs", insts.classAttribute(), inst.classAttribute());
      assertEquals("Value differs", 1.0, inst.value(0));
      assertEquals("Value differs", 2.0, inst.value(1));
      assertEquals("Value differs", 3.0, inst.value(2));
      assertEquals("Value differs", 0.0, inst.value(3));
      assertEquals("Value differs", 0.0, inst.value(4));
      assertEquals("Value differs", 0.0, inst.value(5));
      assertEquals("Value differs", 0.0, inst.value(6));
      assertEquals("Value differs", 0.0, inst.value(7));
      assertEquals("Value differs", 0.0, inst.value(8));
      assertEquals("Value differs", 0.0, inst.value(9));
      assertEquals("Value differs", 0.0, inst.value(10));
      assertEquals("Value differs", 0.0, inst.value(11));
      assertEquals("Value differs", 0.0, inst.value(12));
      assertEquals("Value differs", 0.0, inst.value(13));
      assertEquals("Value differs", 0.0, inst.value(14));
      assertEquals("Value differs",
}