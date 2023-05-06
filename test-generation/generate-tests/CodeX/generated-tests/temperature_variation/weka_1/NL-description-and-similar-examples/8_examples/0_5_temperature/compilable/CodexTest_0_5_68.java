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


public class CodexTest_0_5_68 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v1 = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    AlgVector v3 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v1.setElement(i, i);
      v2.setElement(i, i * 10);
      v3.setElement(i, i + i * 10);
    }
    AlgVector v4 = v1.add(v2);
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", v3.getElement(i), v4.getElement(i));
    }
  }
}