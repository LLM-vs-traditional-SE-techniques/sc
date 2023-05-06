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


public class CodexTest_0_4_3 { 
  @Test
  public void testGetAsInstanceWithNumericAttribute() {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(1);
      newInst.setDataset(instances);
      newInst.setValue(0, m_Elements[0]);
    }
    assertEquals(instances.numAttributes(), newInst.numAttributes());
    assertEquals(m_Elements[0], new
}