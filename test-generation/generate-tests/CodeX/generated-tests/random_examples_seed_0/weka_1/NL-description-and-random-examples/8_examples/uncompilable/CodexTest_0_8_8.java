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


public class CodexTest_0_8_8 { 
    /**
     * Test of add method, of class com.hfk.math.AlgVector.
     */
    @Test
    public void testAdd() {
      System.out.println(className + ".testAdd");
      int x = 3;
      int y = 4;
      int z = 5;
      AlgVector v1 = new AlgVector(x,y,z);
      AlgVector v2 = new AlgVector(x*2,y*2,z*2);
      AlgVector add= v1.add(v2);
      assertEquals(add, new AlgVector(x*3,y*3,z*3));
    }
}