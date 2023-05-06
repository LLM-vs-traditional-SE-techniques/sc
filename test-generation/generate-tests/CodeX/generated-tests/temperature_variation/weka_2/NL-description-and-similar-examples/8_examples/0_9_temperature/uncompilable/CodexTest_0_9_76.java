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


public class CodexTest_0_9_76 { 
  @Test
  // Test random generation of data
  public void testToInstance() {
    try {
      ClassLoader cl = p.getClass().getClassLoader();
      java.net.URL clu1 = cl.getResource(data/iris.arff);
      ClassLoader cl2 = p.getClass().getClassLoader();
      java.net.URL clu2 = cl2.getResource(data/iris.arff);
      Instances tr = new Instances(clu1.openStream());
      tr.setClassIndex(4);
      Instances tst = new Instances(clu2.openStream());
      tst.setClassIndex(4);
      AlgVector v = new AlgVector(0.0, 1.0, 2.0, 3.0);
      Instance i = v.getAsInstance(tr, rg);
      System.out.println(i);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}