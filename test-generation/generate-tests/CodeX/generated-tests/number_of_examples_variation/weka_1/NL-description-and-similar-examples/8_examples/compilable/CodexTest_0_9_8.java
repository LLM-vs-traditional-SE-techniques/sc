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


public class CodexTest_0_9_8 { 
     @Test
     public void testAddition() {
	AlgVector m1 = new AlgVector(2);
	m1.setElement(0, 5);
	m1.setElement(1, 4);
	AlgVector m2 = new AlgVector(2);
	m2.setElement(0, 2);
	m2.setElement(1, 1);
	AlgVector m3 = new AlgVector(2);
	m3.setElement(0, 7);
	m3.setElement(1, 5);
	AlgVector result = m1.add(m2);
	assertEquals(m3, result);
    }
}