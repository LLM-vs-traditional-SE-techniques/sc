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


public class CodexTest_0_7_17 { 
    @Test
    public void testGetAsInstance_Nominal() throws Exception {
        final Random random = new Random();
        final Instances model = new Instances(new DenseInstance(1), 1);
        model.delete();
        model.add(new DenseInstance(1));
        model.setClassIndex(0);
        final AlgVector vector = new AlgVector(new double[] { 1.0 });
        final Instance instance = vector.getAsInstance(model, random);
        Assert.assertNotNull(instance);
        Assert.assertEquals(0, instance.value(0));
    }
}