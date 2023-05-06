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


public class CodexTest_0_4_1 { 
  @Test
  public void testGetAsInstanceShouldReturnNullWhenElementsAreNull() throws Exception {
    // given
    Instance newInst = null;
    // when
    newInst = new DenseInstance(1);
    // then
    assertNull(newInst);
  }
}