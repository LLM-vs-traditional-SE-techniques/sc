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


public class CodexTest_0_8_4 { 
  @Test
  
  
  
  
  
  
  
  public void testGetAsInstance() {
			Vector1D vector1 = new Vector1D(1.0);
			Instance instance1 = vector1.getAsInstance(null, null);
			Assert.assertEquals(0, instance1.classIndex());
			Assert.assertEquals(0, instance1.classValue(), 0);
		}
}