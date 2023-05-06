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


public class CodexTest_0_8_47 { 
  @Test
  public void testGetAsInstance() {
    // Check default
    assertEquals("class not set to Correct default",
        Instances.DATAMODEL_CLASS, dataModel.getClassSuitableFor(instances));
    
    
    // Check that class already matched is not changed
    Instances matchInstances = new Instances(instances); 
    matchInstances.setClassIndex(matchInstances.numAttributes() - 1);
    
    dataModel = new DataModelDummy(matchInstances, 
        matchInstances.numAttributes() - 1, matchInstances.numAttributes() - 1);
    assertEquals("class changed",
        matchInstances.classIndex(), dataModel.getClassSuitableFor(instances));
    
    try {
      dataModel.getAsInstance(instances, new Random());
      fail("Should have thrown exception");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}