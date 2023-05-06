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


public class CodexTest_0_8_7 { 
  @Test
  public void testGetAsInstance() {
    double[][] data = {{2.3, 3.2, 1.0}, {1.2, 2.2, 3.0}, {5.0, 0.1, 1.0}};
    double[][] inst = {{0.0, 0.0, 1.0}, {0.0, 1.0, 0.0}, {1.0, 0.0, 0.0}};
    Instances insts = null;
    try {
      insts = getInstances("test", data, inst);
    } catch (Exception e) {
      e.printStackTrace();
      fail("Problem creating instances: " + e.toString());
    }
    Random rand = null;
    try {
      rand = Random.makeRand();
    } catch (Exception e) {
      e.printStackTrace();
      fail("Problem creating random: " + e.toString());
    }
    Instance newV = null;
    try {
      newV = m_Tested.getAsInstance(insts, rand);
    } catch (Exception e) {
      e.printStackTrace();
      fail("Problem creating instance: " + e.toString());
    }
    for (int i =
}