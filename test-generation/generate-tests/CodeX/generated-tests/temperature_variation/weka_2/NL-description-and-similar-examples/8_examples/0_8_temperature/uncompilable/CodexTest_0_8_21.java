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


public class CodexTest_0_8_21 { 
  @Test
    public void testGetAsInstanceForSingleFeatureVector() throws Exception {
        double[] features = {1.0, 2.0, 3.0};
        AlgVector featureVector = new AlgVector(features);
        Instances model = createModel(1);
        Instance instance = featureVector.getAsInstance(model, random);
        assertNotNull(instance);
        assertEquals(1.0, instance.value(0));
        assertEquals(2.0, instance.value(1));
        assertEquals(3.0, instance.value(2));
    }
}