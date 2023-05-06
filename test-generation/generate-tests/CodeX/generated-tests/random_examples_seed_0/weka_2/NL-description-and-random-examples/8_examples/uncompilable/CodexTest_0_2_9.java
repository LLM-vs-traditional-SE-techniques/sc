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


public class CodexTest_0_2_9 { 
  @Test
    public void testGetAsInstance() {
        Instances model = null;
        Random random = null;
        DenseInstance instance = null;
        DenseInstance result = null;
        try {
            result = instance.getAsInstance(model, random);
            fail("Exception expected!");
        } catch (Exception ex) {
            // ok
        }
    }
}