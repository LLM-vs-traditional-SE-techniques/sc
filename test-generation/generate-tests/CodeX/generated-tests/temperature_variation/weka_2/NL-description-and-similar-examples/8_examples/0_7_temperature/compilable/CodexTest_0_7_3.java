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
    public void testGetAsInstance() {
    	Instances model = null;
    	Random random = null;
    	AlgVector v = null;
    	Instance result = null;
    	try {
    		result = v.getAsInstance(model, random);
    		fail("Exception expected");
    	} catch(Exception e) {
    	}
      }

}