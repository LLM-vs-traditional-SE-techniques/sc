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


public class CodexTest_0_9_5 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(3);
      newInst.setDataset(new Instances(new ArrayList<String>()));
}