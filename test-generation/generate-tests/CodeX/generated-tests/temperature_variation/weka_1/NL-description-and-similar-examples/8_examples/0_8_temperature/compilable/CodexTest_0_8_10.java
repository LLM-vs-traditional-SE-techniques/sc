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


public class CodexTest_0_8_10 { 
  @Test
   public void testAdd() {
        int n = 9;
        AlgVector a = new AlgVector(n);
        AlgVector b = new AlgVector(n);
        for(int i = 0; i < n; i++) {
            a.setElement(i,1.0);
            b.setElement(i,2.0);
        }
        AlgVector c = a.add(b);
        for(int i = 0; i < n; i++) {
            assertEquals("Non matching elements", 3.0, c.getElement(i));
        }
    }
}