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


public class CodexTest_0_8_99 { 
  @Test
  private void testGetAsInstance() {
    Instances model = null;
    Random random = null;
    try {
      AlgVector test = new AlgVector(1);
      Instance result = test.getAsInstance(model, random);
      assertEquals("result", null, result);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}