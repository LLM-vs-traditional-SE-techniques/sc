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


public class CodexTest_0_7_5 { 
  @Test
  public void testGetAsInstance() {
    Instances iris = null;
    try {
      iris = DataSource.read("test/iris.arff");
      iris.setClassIndex(iris.numAttributes() - 1);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem reading iris data");
    }
    WekaPackageManager.loadPackages(false, true, false);
    Random random = new Random(1);
    Instance orig = iris.instance(5);
    SparseInstance sparse = new SparseInstance(orig);
    Instance dense = sparse.getAsInstance(iris, random);
    assertEquals(orig, dense);
  }
}