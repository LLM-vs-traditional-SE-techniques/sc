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


public class CodexTest_0_8_7 { 
  @Test(expected = NullPointerException.class)
  public void testAddShouldThrowNullPointerExceptionWhenNullGiven() {
    AlgVector a = new AlgVector(10);
    AlgVector b = null;
    // when
    AlgVector result = a.add(b);
    // then
    assertNull(result);
  }
}