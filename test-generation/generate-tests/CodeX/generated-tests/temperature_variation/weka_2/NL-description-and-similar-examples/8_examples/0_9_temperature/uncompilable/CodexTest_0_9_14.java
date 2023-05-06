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


public class CodexTest_0_9_14 { 
  @Test
    public void testGetAsInstance(){
    String target = "gt";
    String[] options = weka.core.Utils.splitOptions("");
    weka.filters.supervised.attribute.IBk targetFilter = null;
    try {
      targetFilter = new weka.filters.supervised.attribute.IBk();
    } catch (Exception ex) {
      Assert.fail("Exception thrown on construction: " + ex.getMessage());
    }
    Assert.assertEquals("IBk: ", targetFilter.globalInfo(), target);
  }
}