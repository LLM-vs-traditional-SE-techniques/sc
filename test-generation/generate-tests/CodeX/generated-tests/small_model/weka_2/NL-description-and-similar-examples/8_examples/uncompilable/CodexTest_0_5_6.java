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


public class CodexTest_0_5_6 { 
  @Test
    public void testGetAsInstanceShouldReturnInstanceWithCorrectValues() {
        // given
        Instance expectedInst = new DenseInstance(3);
        expectedInst.setValue(0, 0.1);
        expectedInst.setValue(1, 0.2);
        expectedInst.setValue(2, 0.3);
        // when
        Instance result = m_Vector.getAsInstance(m_Model, m_Random);
        // then
        assertEquals("
}