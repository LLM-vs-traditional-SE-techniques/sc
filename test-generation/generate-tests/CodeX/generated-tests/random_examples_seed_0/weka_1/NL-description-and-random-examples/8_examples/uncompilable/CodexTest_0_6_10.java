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


public class CodexTest_0_6_10 { 
  @Test
    public void testAdd() {
       AlgVector v1 = new AlgVector(5);
       AlgVector v2 = new AlgVector(5);
       AlgVector v3 = v1.add(v2);
       for(int i = 0; i < 5; i++) {
	 assertTrue(v3.m_Elements[i] == 0.0);
       }
    }
}