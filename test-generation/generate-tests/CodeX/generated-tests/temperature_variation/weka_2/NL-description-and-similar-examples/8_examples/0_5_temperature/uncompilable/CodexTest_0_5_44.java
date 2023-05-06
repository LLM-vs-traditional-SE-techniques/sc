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


public class CodexTest_0_5_44 { 
  @Test
    public void testAddElements() {
        AlgVector v1 = new AlgVector(3);
        AlgVector v2 = new AlgVector(5);
        v1.addElements(v2);
        assertEquals("Length differs", 8, v1.numElements());
    }
}