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


public class CodexTest_0_3_2 { 
  @Test
    public void testGetAsInstance() {
        Instances inst = new Instances(m_Instances, 0);
        inst.setClassIndex(0);
        Instance instNew = m_Instance.getAsInstance(inst, new Random(1));
        assertEquals(inst.numAttributes(), instNew.numAttributes());
        assertEquals(inst.numClasses(), instNew.numClasses());
        assertEquals(inst.classAttribute().value((int) instNew.classValue()),
                instNew.stringValue(0));
        assertEquals(inst.classAttribute().value((int) m_Instance.classValue()),
                m_Instance.stringValue(0));
    }
}