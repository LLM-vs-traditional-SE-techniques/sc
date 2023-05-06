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


public class CodexTest_0_9_97 { 
  @Test
  public void testGetAsInstanceWithOneInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
					      "SrcFile,Class,NomAttr,NumAttr,"
							    +"StringAttr,DateAttr,RelationAttr\n"
							    +"a,0,c,1,d,Thu Dec 04 16:18:29 EST 2008,@rel\n")));
    double[] v = {1,0};
    AlgVector vec = new AlgVector(v);
    Random r = new Random();
    try {
      Instance empty = vec.getAsInstance(model, r);
      assertEquals("Number of attributes differ",model.numAttributes(), empty.numAttributes());
      assertTrue("Not empty",empty.hasMissingValue());
      Instance notEmpty = vec.getAsInstance(model, r);
      assertEquals("Number of attributes differ",model.numAttributes(), notEmpty.numAttributes());
      assertFalse("Empty",notEmpty.hasMissingValue());
      int index = 0;
      for (int i = 0; i < notEmpty.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  assertEquals("double: "+(index+1)+". value differs", v[index], notEmpty.value(i));
	  index++;
	}
	if (model.attribute(i).isNominal()) {
	  assertTrue("nominal: "+(i+1)+". value differs", 
		     model.attribute(i).numValues()>notEmpty.value(i));
	}
      }
    } catch (Exception e) {
      fail("Exception: "+e);
    }
  }

}