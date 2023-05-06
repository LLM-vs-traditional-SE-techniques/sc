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


public class CodexTest_0_7_72 { 
  @Test
  public void testAddDiffSize(){
		AlgVector a = new AlgVector(3);
		AlgVector b = new AlgVector(2);
		AlgVector c = new AlgVector(3);		
		assertEquals(a.add(b), c);
	}
	
}