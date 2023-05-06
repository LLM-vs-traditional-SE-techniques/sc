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


public class CodexTest_0_5_9 { 
  @Test
    public void testToString() {
        AlgVector v = new AlgVector(2);
        v.setElement(0, 1.0);
        v.setElement(1, 2.0);
        assertEquals("1.0, 2.0", v.toString());
    }
}