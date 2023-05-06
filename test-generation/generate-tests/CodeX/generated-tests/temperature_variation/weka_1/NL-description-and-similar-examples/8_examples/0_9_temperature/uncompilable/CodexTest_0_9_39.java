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


public class CodexTest_0_9_39 { 
  @Test
  public void testNumElements() {
    int[] dims = {10, 10};
    AlgMatrix m = new AlgMatrix(15, 2);
    assertEquals(10, m.numElements());
  }
}