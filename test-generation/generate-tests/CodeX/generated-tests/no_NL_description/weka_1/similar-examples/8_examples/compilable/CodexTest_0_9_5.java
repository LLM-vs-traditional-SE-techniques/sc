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


public class CodexTest_0_9_5 { 
  @Test
   public void testAdd() {
       int n = 22;
       AlgVector v1 = new AlgVector(n);
       for(int i = 0; i < n; i++) {
           v1.setElement(i, 1);
       }
       AlgVector v2 = new AlgVector(n);
       for(int i = 0; i < n; i++) {
           v2.setElement(i, 2);
       }
       AlgVector v3 = v1.add(v2);
       for(int i = 0; i < n; i++) {
           assertEquals((i+1) + " value addition wrong", v1.getElement(i) + v2.getElement(i), v3.getElement(i), 1e-8);
       }
   }
}