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
  public void testGetAsInstance() throws Exception  {
    String[] options = {
    "-R first-last"};
    FillMissingValues filter = new FillMissingValues();
    try {
      filter.setOptions(options);
      if (filter.getDebug())
	filter.logOptions();
      Filter.useFilter(m_InstancesChecker, filter);
    } catch (Exception e) {
      fail("Exception thrown on setOptions(): \n" + e.getMessage());
    }
    Instances result = Filter.useFilter(m_InstancesChecker, filter);
    for (int i = 0; i < result.numAttributes(); i++) {
      if (result.attribute(i).isNumeric()) {
	assertEquals("All numeric missing values should have been replaced with "
		     +" averages.", 0, result.meanOrMode(i));
      }
    }
}