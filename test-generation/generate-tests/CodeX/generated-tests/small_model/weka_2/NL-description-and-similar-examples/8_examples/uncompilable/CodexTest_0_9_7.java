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


public class CodexTest_0_9_7 { 
  @Test
      public void testRunTest() {
			EqualsTest instance = new EqualsTest();
			
			// run test
						instance.runTest();
						
						assertTrue(instance.getExceptionThrown().isEmpty());
						
						// check results
						assertEquals(2, instance.resultCount);
			
}