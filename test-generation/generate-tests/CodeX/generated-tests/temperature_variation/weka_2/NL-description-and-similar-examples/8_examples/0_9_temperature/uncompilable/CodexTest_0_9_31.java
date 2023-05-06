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


public class CodexTest_0_9_31 { 
  @Test
  public void testGoodToString() {
    String result = "";
    String result2 = "";
    String[] options = null;
    Attribute att1 = new Attribute("Att1", (FastVector)null);
    Attribute att2 = new Attribute("Att2", (FastVector)null);
    try {
      result = Utils.joinOptions(options);
    } catch (Exception e) {
    }
    assertEquals("toString had wrong result", null, result);
}