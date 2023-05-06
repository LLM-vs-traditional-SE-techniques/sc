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


public class CodexTest_0_9_5 { 
  @Test
    /**
     * Test sparse instance as per SparseInstance
     *
     * @param filename the name of the arff instace
     */
    protected weka.core.Instance getSparseInstance(String filename, Random rand) {
        weka.core.Instances instances = new weka.core.Instances(new
                java.io.BufferedReader(new java.io.StringReader(this.sparseInstances)));
        instances.setClassIndex(instances.numAttributes() - 1);
        weka.core.Instance newInst = null;
        try {
            newInst = instances.get(0).getAsInstance(instances, rand);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
        return newInst;
    }
}