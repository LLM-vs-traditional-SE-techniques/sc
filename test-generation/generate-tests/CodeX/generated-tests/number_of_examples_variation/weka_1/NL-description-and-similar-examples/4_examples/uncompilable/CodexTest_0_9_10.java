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


public class CodexTest_0_9_10 { 
  	@Test
  	public void testAdd_addNull()
  	{
  		AlgVector first = new AlgVector(3);
  		assertNull(first.add(null));
  	}
  
  	@Test
  	public void testAdd_addSizeLessThanZero()
  	{
  		AlgVector first = new AlgVector(-1);
  		AlgVector second = new AlgVector(-1);
  		assertNull(first.add(second));
  	}
  
  	@Test
  	public void testAdd_addSizeEqualsZero()
  	{
  		AlgVector first = new AlgVector(0);
  		AlgVector second = new AlgVector(0);
  		assertNull(first.add(second));
  	}
  
  	@Test
  	public void testAdd_addSizeEqualsOne()
  	{
  		AlgVector first = new AlgVector(1);
  		AlgVector second = new AlgVector(1);
  		assertEquals(first.add(second).getElement(0), 0.0);
  	}
  
  	@Test
  	public void testAdd_addSizeEqualsTwo()
  	{
  		AlgVector first = new AlgVector(2);
  		AlgVector second = new AlgVector(2);
  		assertEquals(first.add(second).getElement(0), 0.0, 0);
  		assertEquals(first.add(second).getElement(1), 0.0, 0);
  	}
  
  	@Test
  	public void testAdd_addSizeEqualsThree()
  	{
  		AlgVector first = new AlgVector(3);
  		AlgVector second = new AlgVector(3);
  		assertEquals(first.add(second).getElement(0), 0.0, 0);
  		assertEquals(first.add(second).getElement(1), 0.0
}