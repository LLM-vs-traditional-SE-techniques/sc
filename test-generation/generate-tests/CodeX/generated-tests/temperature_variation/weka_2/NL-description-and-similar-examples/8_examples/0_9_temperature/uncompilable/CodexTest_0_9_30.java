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


public class CodexTest_0_9_30 { 
    @Test
	public void testGetAsInstance() throws Exception {
		Instances insts = new Instances(new StringReader(DATASETHDR
				+ DATASETDATA));
		AlgVector v = new AlgVector(insts.numAttributes());
		v.setElement(0, 0);
		v.setElement(1, 1);
		v.setElement(2, 0);
		v.setElement(3, 1);
		v.setElement(4, 0);
}