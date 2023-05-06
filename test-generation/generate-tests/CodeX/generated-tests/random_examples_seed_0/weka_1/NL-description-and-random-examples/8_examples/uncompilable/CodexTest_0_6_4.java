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


public class CodexTest_0_6_4 { 
    @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(2);
        v1.set(0,1);
        v1.set(1,2);
        AlgVector v2 = new AlgVector(2);
        v2.set(0,4);
        v2.set(1,5);
        AlgVector v3 = v1.add(v2);
        assertEquals(5,v3.get(0),0.001);
        assertEquals(7,v3.get(1),0.001);
    }
}