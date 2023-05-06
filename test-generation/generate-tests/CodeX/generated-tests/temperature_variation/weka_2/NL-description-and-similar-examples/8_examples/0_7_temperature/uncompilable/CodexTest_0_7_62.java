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


public class CodexTest_0_7_62 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int num = 30;
    int numAtts = 3;
    double[][] atts = new double[num][numAtts];
    for (int i = 0; i < atts.length; i++) {
      for (int j = 0; j < numAtts; j++) {
        atts[i][j] = Math.random();
      }
    }
    Instances insts = makeTestDataset(num, numAtts, atts);
    AlgVector[] vectors = new AlgVector[num];
    for (int i = 0; i < vectors.length; i++) {
      vectors[i] = new AlgVector(atts[i]);
    }
    Instance[] newInsts = new Instance[num];
    for (int i = 0; i < vectors.length; i++) {
      newInsts[i] = vectors[i].getAsInstance(insts, new Random(1));
    }
    for (int i = 0; i < vectors.length; i++) {
      for (int j = 0; j < numAtts; j++) {
        assertEquals("Vectors differ: " + vectors[i] + " " + 
		     newInsts[i], atts[i][j], newInsts[i].value(j), 1e-6);
      }
    }
  }
}