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


public class CodexTest_0_9_90 { 
  @Test
  double[] doubleArray353 = new double[] {0.0, 7, 3.0};
    AlgVector vector370 = new AlgVector(doubleArray353);
    Instances instances371 = ((Instances) new DenseInstances(vector370.asWekaInstance(100), 1));
    Instance result = vector370.getAsInstance(instances371, new SecureRandom());
    double[] expectedResult = new double[] {1.0, 0.0, 0.0};
    assertArrayEquals("Not an instance.", expectedResult, result.toDoubleArray(), 0.001D);
}