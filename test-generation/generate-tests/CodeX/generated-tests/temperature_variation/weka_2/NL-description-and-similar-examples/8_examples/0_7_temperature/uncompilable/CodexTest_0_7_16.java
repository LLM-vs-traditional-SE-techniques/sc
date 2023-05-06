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


public class CodexTest_0_7_16 { 
  @Test
    public void testGetAsInstanceNominal() throws Exception {
        Vector v = new Vector(new double[] {5,5,5,5,5});
        Instances insts = getIrisInstances();
		insts.setClassIndex(4);
		Instance inst = v.getAsInstance(insts, new Random(1));
		assertEquals(2, inst.value(4));
    }
}