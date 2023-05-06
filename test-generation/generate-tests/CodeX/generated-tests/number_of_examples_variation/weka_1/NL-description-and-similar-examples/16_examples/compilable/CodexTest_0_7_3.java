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


public class CodexTest_0_7_3 { 
  @Test
    public void testAdd() {
	AlgVector v1 = new AlgVector(10);
	AlgVector v2 = new AlgVector(10);
	for(int i = 0; i < 10; i++) {
	    v1.setElement(i, (float)i);
	    v2.setElement(i, (float)(i+1)/2);
	}
	AlgVector v3 = v1.add(v2);
	for(int i = 0; i < 10; i++) {
	    assertEquals(v3.getElement(i), v1.getElement(i)+v2.getElement(i), 0);
	}
    }
}