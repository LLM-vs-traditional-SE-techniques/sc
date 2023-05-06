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


public class CodexTest_0_8_3 { 
  @Test
    public void testRandomInstanceInputs() {
        Random random = new Random();
        DenseInstance instance = new DenseInstance(5);
        for (int i = 0; i < instance.numAttributes(); i++) {
            instance.setValue(i, random.nextDouble());
        }
        try {
        DenseInstance newInstance = (DenseInstance) instance.getAsInstance(instance.dataset(), random);
        assertEquals("The input and output instances are not the same.", instance, newInstance);
        } catch (Exception e) {
            fail("unexpected exception");
        }
    }
}