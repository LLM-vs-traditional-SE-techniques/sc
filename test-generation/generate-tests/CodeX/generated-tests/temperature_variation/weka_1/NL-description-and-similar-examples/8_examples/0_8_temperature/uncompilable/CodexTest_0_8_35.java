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


public class CodexTest_0_8_35 { 
  @Test
    public void testClone() {
        AlgVector v1 = new AlgVector(5);
        AlgVector v2 = (AlgVector)v1.clone();
        v1.setElement(0, 5);
        assertFalse("Test 1: Incorrect clone.", v1.getElement(0) == v2.getElement(0));
        v1.setElement(0, 0);
        v1.addToElement(0, 1);
        assertFalse("Test 2: Incorrect clone.", v1.getElement(0) == v2.getElement(0));
    }
}