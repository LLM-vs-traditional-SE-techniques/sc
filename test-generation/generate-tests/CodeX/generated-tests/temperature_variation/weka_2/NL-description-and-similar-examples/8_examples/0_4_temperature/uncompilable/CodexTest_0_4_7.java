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


public class CodexTest_0_4_7 { 
  @Test
    public void testGetAsInstance() {
        Instances dataset = new Instances(new BufferedReader(new StringReader(InstancesTest.DATATEST_HEADER)));
        dataset.setClassIndex(dataset.numAttributes() - 1);
        double[] values = new double[dataset.numAttributes()];
        for (int i = 0; i < dataset.numAttributes(); i++) {
            values[i] = i;
        }
        Instance instance = new DenseInstance(1.0, values);
        instance.setDataset(dataset);
        AlgVector vector = new AlgVector(instance);
        assertEquals(vector.getAsInstance(dataset, null), instance);
    }
}