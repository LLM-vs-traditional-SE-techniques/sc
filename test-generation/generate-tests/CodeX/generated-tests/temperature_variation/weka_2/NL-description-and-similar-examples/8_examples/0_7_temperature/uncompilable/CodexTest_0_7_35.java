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


public class CodexTest_0_7_35 { 
  @Test
    public void testGenerateProperlyResetsInstances() {
        Instances instances = new Instances(this.dataset, 2);
        instances.add(this.instance1);
        instances.add(this.instance2);
        Instance newInst = null;
        try {
            newInst = this.instance3.getAsInstance(instances, this.random);
        } catch (Exception ex) {
            fail("Exception occurred during generating instance: " + ex.getMessage());
        }
        assertEquals("Number of attributes incorrect", 1, instances.numAttributes());
        assertEquals("Number of instances incorrect", 0, instances.numInstances());
    }
}