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


public class CodexTest_0_8_23 { 
  @Test
  public void testClassify() {
    try {
      SimpleKMeans simpleKMeans = new SimpleKMeans();
      simpleKMeans.setSeed(1);
      simpleKMeans.setNumClusters(3);
      Instances inst = simpleKMeans.getClusterCentroids();
      for (int i = 0; i < inst.numInstances(); i++) {
        Instance instI = inst.instance(i);
        m_Tee.println(instI);
      }
    } catch (Exception e) {
      fail("Exception in testClassify: " + e);
    }
  }
}