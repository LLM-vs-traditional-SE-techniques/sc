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


public class CodexTest_0_8_19 { 
    @Test
    public void testGetAsInstance() {
        Classifier c = createVotingModel();
        Random random = new Random(1);
        Instances model = createTestDataset();
        double[] vector = new double[]{1.0, 1.0};
        AlgVector algVector = new AlgVector(vector);
        Instance newInst = algVector.getAsInstance(model, random);
        double[] result = new double[]{1.0, 1.0, 0.0, 1.0, 1, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1, 1.0};
        assertArrayEquals(result, newInst.toDoubleArray(), 1.0e-9);
    }
}