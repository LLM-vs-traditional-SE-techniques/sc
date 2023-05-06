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
      public void testNumeric() {
		Instances header = new Instances(getName());
		header.attribute("a", "1,2,3".split(",")); // nominal
		header.attribute("b", "x,y,z,t".split(",")); // nominal
		header.attribute("c"); // numeric
		header.attribute("d"); // numeric
		header.add(new double[][]{{1, 1, 0, 0}});
		header.add(new double[][]{{2, 2, 0, 0}});
		header.add(new double[][]{{3, 3, 0, 0}});
		int oldSize = header.numInstances();
		DenseInstance result = new DenseInstance(3);
		result.setDataset(header);
		if (header.checkInstance(result)) {
		  try {
		    Instances newData = result.getAsInstance(header);
		    assertEquals(oldSize + 1, newData.numInstances());
}