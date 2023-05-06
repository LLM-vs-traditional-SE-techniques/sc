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
    public void testNominalPrefix() throws Exception {
			DataSource source = new DataSource("testsrc/iris.arff");
			Instances data = source.getDataSet();
			// create the attribute index array
			int[] atts = new int[data.numAttributes()];
			boolean allNumeric = true;
			for (int i = 0; i < data.numAttributes(); i++) {
			  atts[i] = i;
			  Attribute att = data.attribute(i);
			  if (att.isNominal() || att.isString()) {
					allNumeric = false;
				}
			}
}