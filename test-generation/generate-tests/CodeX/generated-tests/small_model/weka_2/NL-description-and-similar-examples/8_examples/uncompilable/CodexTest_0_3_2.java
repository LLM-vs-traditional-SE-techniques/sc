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
    public void testGetAsInstance() throws Exception {
        Instance newInst = null;
        if (m_Elements != null) {
            newInst = new DenseInstance(1);
            newInst.setDataset(m_Dataset);
            newInst.setValue(0, m_Elements[0]);
        }
        assertEquals(newInst, m_Vector.getAsInstance(m_Dataset, new Random(1
}