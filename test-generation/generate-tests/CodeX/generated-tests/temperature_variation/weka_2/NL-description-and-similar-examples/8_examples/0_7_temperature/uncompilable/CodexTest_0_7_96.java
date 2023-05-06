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


public class CodexTest_0_7_96 { 
  @Test
    public void testGetAsInstance() {
        // Given
        double[] data = {2.3, 1.2, 5.0};
        TestInstances model = new TestInstances();
        AlgVector v = new AlgVector(data);
        // When
        Instance newInst = v.getAsInstance(model, new Random(1));
        // Then
        assertEquals(2.3, newInst.value(0), 0.0);
        assertEquals(1.0, newInst.value(1), 0.0);
        assertEquals(5.0, newInst.value(2), 0.0);
    }
}