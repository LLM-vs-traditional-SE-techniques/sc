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


public class CodexTest_0_4_8 { 
  @Test
    public void testAddVector() {
        AlgVector a = new AlgVector(2);
        a.setElement(0, 2);
        a.setElement(1, 3);
        AlgVector b = new AlgVector(2);
        b.setElement(0, 3);
        b.setElement(1, 4);
        AlgVector c = a.add(b);
        assertEquals(5, c.getElement(0));
        assertEquals(7, c.getElement(1));
    }
}