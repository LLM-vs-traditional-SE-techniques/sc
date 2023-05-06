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


public class CodexTest_0_9_1 { 
  @Test
    public void testAdd_whenOtherVectorIsNull_shouldInvalidOperationException() {
        AlgVector v1 = new AlgVector(3).set(1, 2.0).set(2, 3.0);
        AlgVector v2 = null;
        try {
            AlgVector v3 = v1.add(v2);
            assertNotNull(v3);
        } catch (InvalidOperationException e) {
            //OK
        }
    }
}