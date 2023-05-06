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


public class CodexTest_0_8_6 { 
  @Test
  public void testNumericToCategoricalNominal() {
    Instances nom = null;
    Instances ord = null;
    try {
      nom = Utils.load("../data/ClassifierTest.arff");
      ord = Utils.load("../data/ClassifierTest2.arff");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    Random rand = new Random(1);
    Instance inst = null;
    try {
      inst = nom.instance(0).getAsInstance(ord, rand);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue("Attribute types differ", inst.attribute(0).isNominal());
}
}