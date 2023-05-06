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


public class CodexTest_0_6_38 { 
  @Test(expected = Exception.class)
    public void testInstance() throws Exception {
        double[] data = {1, 2, 3, 4, 5, 6};
        AlgVector v = new AlgVector(data);
        Random random = new Random(0);
        Instance instance = v.getAsInstance(null, random);
    }
}