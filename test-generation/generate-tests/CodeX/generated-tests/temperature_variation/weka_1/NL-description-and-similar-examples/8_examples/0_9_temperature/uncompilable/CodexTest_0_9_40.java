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


public class CodexTest_0_9_40 { 
  @Test
   public void testAddVector() {
        AlgVector v1 = new AlgVector(6, true);
	v1.add(2.1);
	v1.add(3.2);
	AlgVector v2 = new AlgVector(6, true);
	v2.add(0.1);
	v2.add(1.2);
	AlgVector v3 = v1.add(v2);
	AlgVector v4 = new AlgVector(6, true);
	v4.add(2.2);
	v4.add(4.4);
        assertEquals(v3,v4);
    }
}