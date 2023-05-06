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


public class CodexTest_0_8_50 { 
  @Test
    public void testGetAsInstance() throws Exception {
    AlgVector algVector = new AlgVector(new double[]{0.0, 1.0, 2.0});
    Instances instances = new Instances(new StringReader(
            "A1,A2,A3,A4\n" +
                    "0.0,1.0,2.0,3.0\n" +
                    "1.0,2.0,3.0,4.0"));
    assertEquals(instances.get(0), algVector.getAsInstance(instances, new Random(4)));
  }
}