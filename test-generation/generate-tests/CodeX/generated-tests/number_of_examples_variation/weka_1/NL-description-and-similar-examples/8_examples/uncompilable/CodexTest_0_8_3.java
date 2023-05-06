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


public class CodexTest_0_8_3 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = new AlgVector(data);
    AlgVector v4 = v1.add(v2);
    for(int i = 0; i < data.length; i++) {
       v2.m_Elements[i] = v2.m_Elements[i] + v3.m_Elements[i];
    }
    assertEquals(v4, v2);
  }
}