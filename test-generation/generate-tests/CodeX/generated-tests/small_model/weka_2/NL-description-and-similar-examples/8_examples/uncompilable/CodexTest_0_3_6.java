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


public class CodexTest_0_3_6 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(2);
      newInst.setDataset(new Instances("test", new double[] {1, 2}, 2));
      newInst.setValue(0, 1);
      newInst.setValue(1, 2);
    }
    assertEquals(newInst, m
}