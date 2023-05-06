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


public class CodexTest_0_8_32 { 
    @Test
    public void testInstanceConstructor() throws Exception {
      int len = 22;
      Instance instance = RandomTestUtils.nextInstance(
        new DenseInstances(new DenseInstance(len), 4));
      AlgVector v = new AlgVector(instance);
      Assert.assertEquals("Length differs", len, v.numElements());
    }
}