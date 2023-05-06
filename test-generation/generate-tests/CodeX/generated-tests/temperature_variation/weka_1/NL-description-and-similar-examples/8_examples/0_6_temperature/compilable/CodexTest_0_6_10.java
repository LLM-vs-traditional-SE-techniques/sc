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


public class CodexTest_0_6_10 { 
  @Test
  public void testAdd() {
    int len = 5;
    AlgVector v1 = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    AlgVector v3 = new AlgVector(len);
    for(int i = 0; i < len; i++) {
      v1.setElement(i, i+1);
      v2.setElement(i, i+2);
      v3.setElement(i, i+1+i+2);
    }
    assertEquals("add() failed", v3, v1.add(v2));
  }
}