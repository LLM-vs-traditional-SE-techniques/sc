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


public class CodexTest_0_6_7 { 
  @Test
    public void testAdd() {
        AlgVector a = new AlgVector(5,2.5);
        AlgVector b = new AlgVector(5,1.5);
        AlgVector c = a.add(b);
        assertEquals(new AlgVector(5,3.0), c);
    }
}