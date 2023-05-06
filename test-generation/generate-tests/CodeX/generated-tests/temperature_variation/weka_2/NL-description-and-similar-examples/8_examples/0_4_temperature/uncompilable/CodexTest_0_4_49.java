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


public class CodexTest_0_4_49 { 
  @Test
    public void testGetAsInstance() {
        Instances inst = new Instances(m_Instances, 0);
        Random random = new Random(1);
        Instance inst2 = m_Filter.getAsInstance(inst, random);
        assertEquals(inst.numAttributes(), inst2.numAttributes());
        for (int i = 0; i < inst.numAttributes(); i++) {
            if (inst.attribute(i).isNumeric()) {
                assertEquals(m_Elements[i], inst2.value(i), 0.0);
            }
            if (inst.attribute(i).isNominal()) {
                assertEquals(0, inst2.value(i), 0.0);
            }
        }
    }
}