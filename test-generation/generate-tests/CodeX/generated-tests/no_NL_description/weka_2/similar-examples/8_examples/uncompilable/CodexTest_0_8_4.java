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
    int numAtts = 6;
    int numVals = 5;
    Instances header = new Instances(m_Data,numAtts);
    header.setClassIndex( header.numAttributes()-1 );
    Instance empty = null;
    try {
      empty = getAsInstance(header, new Random());
    } catch(Exception e) {
      fail("Problem setting up instances");
    }
    assertEquals( "Number of attributes", numAtts, empty.numAttributes() );
    assertEquals( "Number of values", numVals,
		  empty.relationalValue(0).numInstances() );
  }
}