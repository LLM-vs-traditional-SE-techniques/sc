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


public class CodexTest_0_8_7 { 
    public void testAdd() {
    	AlgVector v = new AlgVector();
    	AlgVector w = new AlgVector();
    	double[] a = {1,2,3,4};
    	double[] b = {-1,-2,-3,-4};
    	v.setElements(a);
    	w.setElements(b);
    	AlgVector result = new AlgVector();
    	AlgVector solution = new AlgVector();
    	result = v.add(w);
    	double[] c = {0,0,0,0};
    	solution.setElements(c);
    	Assert.assertArrayEquals(solution.getElements(), result.getElements(), 1e-10);
    }
    
    @Test
    public void testAdd_Random() {
    	AlgVector v = new AlgVector(10);
    	AlgVector w = new AlgVector(10);
    	AlgVector result = new AlgVector(10);
    	double[] a = new double[10];
    	double[] b = new double[10];
    	for (int i = 0; i < 10; i++) {
    		a[i] = Math.random();
    		b[i] = Math.random();
    	}
    	v.setElements(a);
    	w.setElements(b);
    	result = v.add(w);
    	for (int i = 0; i < 10; i++) {
    		assertEquals(a[i] + b[i], result.getElements()[i], 1e10);
    	}
    }
    
    @Test
    public void testAdd_Failed() {
    	AlgVector v = new AlgVector();
    	AlgVector w = new AlgVector();
    	double[] a = {1,2,3,4};
    	double[] b = {-1,-2,-3,-4};
    	v.setElements(a);
    	w.setElements(
}