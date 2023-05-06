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


public class CodexTest_0_8_5 { 
  @Test
  public Instance getAsInstances(Instances model, Random random) {
    Instance newInstance = null;
    if (m_Elements != null) {
      newInstance = new SparseInstance(m_Elements.length);
      newInstance.setDataset(model);
      for (int i = 0; i < m_Elements.length; i++) {
        newInstance.setValue(i, m_Elements[i]);
      }
    }
}