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


public class CodexTest_0_6_7 { 
  @Test
  public void testGetAsInstanceShouldThrowExceptionIfAttrCountDiffer() {
    // given
    AlgVector v = new AlgVector(1.2);
    Instances model = new Instances("test", new Attribute("attr", "string"), 2);
    // when
    try {
      v.getAsInstance(model, new Random());
      fail("Should have thrown exception");
    } catch (Exception e) {
      // expected
    }
  }

}