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


public class CodexTest_0_7_6 { 
    @Test
    public void testGetAsInstance_instances() throws Exception {
        int numAtt = 4;
        int numInst = 5;
        int seed = 4;
        Instances data = createInstancesWithNumAttributes(numAtt);
        data.setClassIndex(numAtt - 1);
        AlgVector vec = createAlgVector();
        Instance inst = vec.getAsInstance(data, new Random(seed));
        assertEquals("Number of attributes in instance differs.", numAtt, inst.numAttributes());
        assertEquals("Number of instances in instance differs.", numInst, inst.numInstances());
        checkInstance(inst);
    }
}