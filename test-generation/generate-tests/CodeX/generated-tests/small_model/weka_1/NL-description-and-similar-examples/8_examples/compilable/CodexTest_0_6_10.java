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
    public void testAdd_whenVectorIsNull() {
      AlgVector v1 = new AlgVector(1);
      AlgVector v2 = null;
      AlgVector v3 = v1.add(v2);
      assertNull(v3);
    }
}