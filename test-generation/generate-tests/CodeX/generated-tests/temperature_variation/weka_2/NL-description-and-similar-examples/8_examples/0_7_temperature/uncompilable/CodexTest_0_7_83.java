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


public class CodexTest_0_7_83 { 
  @Test
    public void testShouldThrowExceptionIfElementsCountIsSmallerThanAttributesCount() throws Exception {
        // given
        AlgVector vector = new AlgVector(new double[]{1.0, 1.0, 1.0, 1.0});
        Instances instances = DataGenerator.getInstances();
        // when
        try {
            vector.getAsInstance(instances, new Random());
            fail("Exception was not thrown.");
        } catch (Exception e) {
            // then
            assertEquals("Datatypes are not compatible.", e.getMessage());
        }
    }
}