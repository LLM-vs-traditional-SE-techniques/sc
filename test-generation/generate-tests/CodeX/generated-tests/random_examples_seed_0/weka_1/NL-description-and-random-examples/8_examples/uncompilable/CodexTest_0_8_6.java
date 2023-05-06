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


public class CodexTest_0_8_6 { 
  @Test
    public void testM007_AddTwoVectors(){
        AlgVector x = new AlgVector(new double[]{1.0,2.0});
        AlgVector y = new AlgVector(new double[]{3.0,4.0});
        AlgVector z = x.add(y);
        assertEquals(4.0,z.getElementAt(0),1.0e-8);
        assertEquals(6.0,z.getElementAt(1),1.0e-8);
    }
}