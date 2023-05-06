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


public class CodexTest_0_7_87 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instance inst = new Instance(3);
      AlgVector v = new AlgVector(inst);
      Random r = new Random(1);
      Instances insts = new Instances(v.getAsInstance(insts, r).dataset());
      assertEquals("Number of instances differ", 1, insts.numInstances());
      assertEquals("Number of attributes differ", 3, insts.numAttributes());
}