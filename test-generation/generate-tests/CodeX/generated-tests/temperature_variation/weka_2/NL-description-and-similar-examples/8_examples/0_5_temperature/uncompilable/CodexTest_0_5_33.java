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


public class CodexTest_0_5_33 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(m_Instances, 0);
        model.setClassIndex(0);
        AlgVector v = new AlgVector(new double[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        Instance inst = null;
        try {
            inst = v.getAsInstance(model, new Random(1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertNotNull("Instance is null", inst);
        assertEquals("Wrong class value", 0, (int) inst.classValue());
    }
}