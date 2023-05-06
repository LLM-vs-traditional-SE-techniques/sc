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


public class CodexTest_0_8_38 { 
  @Test
    public void testNumAttributesLength() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(InstancesTest.carRelation)), 0);
        AlgVector av = new AlgVector(5);
        Instance inst = av.getAsInstance(model, new Random(1));
        assertEquals(inst.numAttributes(), 5);
    }
}