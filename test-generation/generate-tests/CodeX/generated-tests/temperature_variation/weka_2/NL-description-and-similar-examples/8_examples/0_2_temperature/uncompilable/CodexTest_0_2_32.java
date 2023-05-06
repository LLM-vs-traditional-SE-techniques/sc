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


public class CodexTest_0_2_32 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new Instance(numAtts), numInstances);
    insts.setClassIndex(numAtts - 1);
    AlgVector vec = new AlgVector(numAtts);
    for (int i = 0; i < numInstances; i++) {
      Instance inst = vec.getAsInstance(insts, new Random(i));
      assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
      assertEquals("Class index differs", numAtts - 1, inst.classIndex());
    }
  }
}