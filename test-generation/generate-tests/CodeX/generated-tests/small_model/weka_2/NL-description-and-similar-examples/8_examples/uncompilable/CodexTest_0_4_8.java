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


public class CodexTest_0_4_8 { 
  @Test
  public void testGetAsInstanceShouldReturnNullWhenNoElementsGiven() {
    // given
    AlgVector v = new AlgVector();
    // when
    Instance result = v.getAsInstance(new DenseInstance(0));
    // then
    assertNull(result);
  }
}