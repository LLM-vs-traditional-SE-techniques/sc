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


public class CodexTest_0_3_1 { 
  @Test
  public void testGetAsInstanceShouldReturnNullWhenNullElements() {
    // given
    AlgVector v = new AlgVector();
    // when
    Instance newInst = v.getAsInstance(null, null);
    // then
    assertNull(newInst);
  }
}