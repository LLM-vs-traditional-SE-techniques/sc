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


public class CodexTest_0_8_26 { 
  @Test
  public void testGetAsInstance() {
    int newVal = (int) (random.nextDouble() * (double) (model.attribute(i).numValues()));
    assertEquals(true, newVal == (int) model.attribute(i).numValues());
  }

}