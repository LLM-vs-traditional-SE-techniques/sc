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


public class CodexTest_0_7_2 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(4);
      newInst.setDataset(m_Dataset);
      double[] data = new double[4];
      data[0] = m_Elements[0];
      data[1] = m_Elements[1];
      data[2] = m
}