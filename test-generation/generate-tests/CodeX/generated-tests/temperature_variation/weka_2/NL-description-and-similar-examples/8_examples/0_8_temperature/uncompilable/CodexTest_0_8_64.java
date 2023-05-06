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


public class CodexTest_0_8_64 { 
  @Test
    public void testBuildClassifier() {
		try {
			ZeroR zeroR = new ZeroR();
			Instances data= TestHelper.makeTestDataset(9, 7, 0, 51.0, 0.0, 1.0);
			data.setClassIndex(data.numAttributes()-1);
			zeroR.buildClassifier(data);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}