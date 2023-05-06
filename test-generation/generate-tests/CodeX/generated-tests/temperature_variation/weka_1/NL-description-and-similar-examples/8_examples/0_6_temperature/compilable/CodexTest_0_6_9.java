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


public class CodexTest_0_6_9 { 
  @Test
    public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.setElement(i, i * 1.0);
      v2.setElement(i, (i + 1) * 1.0);
    }
    v = v.add(v2);
    for (int i = 0; i < len; i++) {
      assertEquals((i + 1) + ". element differs", (i + 1) * 2.0, v.getElement(i));
    }
  }
}