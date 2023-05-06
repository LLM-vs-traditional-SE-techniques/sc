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
  public void testLengthConstructor() {
    int len = 5;
    AlgVector v = new AlgVector(len);
    assertEquals("Length differs", len, v.numElements());
  }
}