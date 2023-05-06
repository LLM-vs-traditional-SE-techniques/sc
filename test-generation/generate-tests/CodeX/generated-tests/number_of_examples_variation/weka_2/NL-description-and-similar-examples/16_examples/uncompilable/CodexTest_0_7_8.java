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


public class CodexTest_0_7_8 { 
  @Test
    public void testAddTwo() {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(2);
        Vector1D v3 = v1.add(v2);
        Assert.assertEquals(3.0, v3.getX(), 1.0e-12);
    }
}