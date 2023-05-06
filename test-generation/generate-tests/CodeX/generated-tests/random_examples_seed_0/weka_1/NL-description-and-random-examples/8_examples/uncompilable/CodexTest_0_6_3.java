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


public class CodexTest_0_6_3 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(1, 2, 3);
        AlgVector v2 = new AlgVector(4, 5, 6);
        AlgVector v3 = v1.add(v2);
        Assert.assertEquals(new AlgVector(5, 7, 9), v3);
    }
}