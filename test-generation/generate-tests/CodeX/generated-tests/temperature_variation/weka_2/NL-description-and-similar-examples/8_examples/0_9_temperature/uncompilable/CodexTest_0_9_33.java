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


public class CodexTest_0_9_33 { 
  @Test
    public void testIsUpToDate() {
    Instances temp = data.stringFreeStructure();
    temp.setClassIndex(0);
    smo.setClassifier(new weka.classifiers.rules.ZeroR());
    smo.setBuildLogisticModels(true);
    try {
      smo.setOptions(weka.core.Utils.splitOptions("-M"));
      smo.buildClassifier(data);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("only nominal class: " + ex.getMessage());
    }
    assertEquals("One classifier model built", 1, 
                 smo.getClassifierSet().size());
    assertEquals("Should be up to date", true, 
                 smo.isUpToDate());
  }
}