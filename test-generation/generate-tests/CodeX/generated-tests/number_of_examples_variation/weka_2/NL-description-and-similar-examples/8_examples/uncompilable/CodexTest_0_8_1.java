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


public class CodexTest_0_8_1 { 
  @Test
    public void testGetAsInstance() {
			// create default dataset
			Instances ref = new Instances(new BufferedReader(new StringReader(TEST_FILE)), 1);
			ref.setClassIndex(ref.numAttributes() - 1);
}