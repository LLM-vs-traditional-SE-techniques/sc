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


public class CodexTest_0_6_8 { 
  @Test
   public void testGetAsInstanceShouldThrowExceptionWhenLengthDoesNotMatchModel() {
        // given
        Random random = new Random();
        Instances model = createTestInstances();
        // when
        try {
            m_Vector.getAsInstance(model, random);
        } catch (Exception e) {
            // then
            assertEquals("length of values does not match model", e.getMessage());
        }
    }

}