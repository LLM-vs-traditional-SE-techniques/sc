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


public class CodexTest_0_8_7 { 
  @Test
    /**
	 * Used by test cases below to create a single dataset.
	 *
	 * @return a dataset with a numeric attribute and a nominal attribute.
	 */
	protected Instances makeTestDataset() throws Exception {
		Instances result = new Instances(new BufferedReader(
				new StringReader(testDataset())));
		result.setClassIndex(result.numAttributes() - 1);
		return result;
	}
}